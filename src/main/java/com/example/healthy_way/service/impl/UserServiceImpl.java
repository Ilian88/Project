package com.example.healthy_way.service.impl;

import com.example.healthy_way.model.entity.UserEntity;
import com.example.healthy_way.model.enums.GenderEnum;
import com.example.healthy_way.model.enums.RoleEnum;
import com.example.healthy_way.model.serviceModel.UserServiceModel;
import com.example.healthy_way.repository.UserRepository;
import com.example.healthy_way.service.RoleService;
import com.example.healthy_way.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RoleService roleService;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, RoleService roleService) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.roleService = roleService;
    }

    @Override
    public void saveUser(UserServiceModel userService) {
        UserEntity user = modelMapper.map(userService,UserEntity.class);

        user.setGenderEnum(GenderEnum.valueOf(userService.getGender()))
                .setRoles(List.of(roleService.findRole(RoleEnum.USER)));

        this.userRepository.save(user);
    }
}
