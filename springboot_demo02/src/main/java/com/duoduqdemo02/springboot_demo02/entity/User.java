package com.duoduqdemo02.springboot_demo02.entity;


import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: Jack
 * @Date: 2019/1/9 22:30
 * @Description:lombok 底层使用字节码技术ASM 修改字节码文件，生成get和set方法。
 *
 *
 *
 * @Data 标签，生成getter/setter toString()等方法
 * @NonNull : 让你不在担忧并且爱上NullPointerException
 * @CleanUp : 自动资源管理：不用再在finally中添加资源的close方法
 * @Setter/@Getter : 自动生成set和get方法
 * @ToString : 自动生成toString方法
 * @EqualsAndHashcode : 从对象的字段中生成hashCode和equals的实现
 * @NoArgsConstructor/@RequiredArgsConstructor/@AllArgsConstructor自动生成构造方法
 * @Data : 自动生成set/get方法，toString方法，equals方法，hashCode方法，不带参数的构造方法
 * @Value : 用于注解final类
 * @Builder : 产生复杂的构建器api类
 * @SneakyThrows : 异常处理（谨慎使用）
 * @Synchronized : 同步方法安全的转化
 * @Getter(lazy=true) :
 * @Log : 支持各种logger对象，使用时用对应的注解，如：@Log4
 *
 * 
 *
 */

public class User {
	@Setter
	@Getter
	private String name;

	@Setter
	@Getter
	private Integer age;
}
