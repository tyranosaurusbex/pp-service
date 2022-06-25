CREATE TABLE `user_registration`.`user` (
  `id` BIGINT NOT NULL,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `date_of_birth` DATETIME NOT NULL,
  `company` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `country` VARCHAR(255) NOT NULL,
  `state` TINYINT NOT NULL,
  PRIMARY KEY (`id`));
