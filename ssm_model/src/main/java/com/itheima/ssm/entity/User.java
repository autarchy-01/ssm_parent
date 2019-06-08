package com.itheima.ssm.entity;

import java.io.Serializable;

import lombok.*;

/**
 * @author  silent
 * @version  1.0
 * @date 2019/06/06 00:24 
 */

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User  implements Serializable {

	private static final long serialVersionUID =  566758474198148711L;

	/**
	 * 用户id,自增
	 */
	private Integer id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 电话号码
	 */
	private String tel;

	/**
	 * 邮箱
	 */
	private String email;

}
