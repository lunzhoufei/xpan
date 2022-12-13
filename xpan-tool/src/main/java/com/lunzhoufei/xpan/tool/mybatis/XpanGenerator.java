package com.lunzhoufei.xpan.tool.mybatis;


import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;


public class XpanGenerator {

    public static void main(String[] args) throws IOException, XMLParserException, SQLException,
            InterruptedException, InvalidConfigurationException {

        List<String> warnings = new ArrayList<>();
        Boolean overWrite = true;

        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(getResourceInClassPath("base/MybatisGenerator.xml"));

        DefaultShellCallback callback = new DefaultShellCallback(overWrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        myBatisGenerator.generate(null);
        warnings.forEach(System.out::println);

        System.out.println("Hello world!");
    }

    public static InputStream getResourceInClassPath(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

}