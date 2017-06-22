CREATE TABLE `demo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `age` tinyint(11) DEFAULT NULL COMMENT '年龄',
  `user_class` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';