package com.spring.webadmin.module.adminRole.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Mybatis Generator on 2020-06-27 00:20:32
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AddAdminRoleDTO implements Serializable {

    /**
     * 角色名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色名称")
    @NotBlank(message = "角色名称不能为空")
    private String roleName;

    /**
     * 角色描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "角色描述")
    @NotBlank(message = "角色描述不能为空")
    private String roleDesc;

    /**
     * 父uk
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "父标识")
    @NotNull
    private String parentUk;


}