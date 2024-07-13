CREATE TABLE `examinee` (
                            `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='被験者';

CREATE TABLE `wine` (
                        `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
                        `toxic` tinyint(1) NOT NULL COMMENT '毒性の有無 TRUE:毒性あり',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='ワイン';

CREATE TABLE `wine_ingestion_history` (
                                          `id` int unsigned NOT NULL AUTO_INCREMENT,
                                          `examinee_id` int unsigned NOT NULL,
                                          `wine_id` int unsigned NOT NULL,
                                          `ingestion_time` datetime NOT NULL,
                                          PRIMARY KEY (`id`),
                                          KEY `wine_history_wine` (`wine_id`),
                                          KEY `wine_history_examinee` (`examinee_id`),
                                          CONSTRAINT `wine_history_examinee` FOREIGN KEY (`examinee_id`) REFERENCES `examinee` (`id`),
                                          CONSTRAINT `wine_history_wine` FOREIGN KEY (`wine_id`) REFERENCES `wine` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='ワイン摂取履歴';