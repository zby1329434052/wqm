package com.water.quality.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.water.quality.asserts.Assert;
import com.water.quality.pojo.entity.User;
import com.water.quality.r.R;
import com.water.quality.r.enums.ResponseEnum;
import com.water.quality.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author
 * @since 2022-02-10
 */
@Api(tags = "管理员登录服务")
@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询用户")
    @GetMapping("/search/user/{username}")
    public R searchUser(@PathVariable("username") @ApiParam(value = "用户名", required = true) String username) {
        List<User> user = userService.list(new QueryWrapper<User>()
                .eq("username", username));
        Assert.isTrue(user.size()>0, ResponseEnum.DATABASE_NULL_ERROR);
        return R.ok().data("user", user.get(0));
    }
}

