package com.yyh.dao;

import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author YanYuHang
 * @Component 把当前类放入IOC容器
 * @create 2019-10-30-18:55
 */
@Component
public class StudentDaoImpl {
    @Autowired
    JdbcTemplate jdbcTemplate;


    private RowMapper<Student> rowMapper= new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int i) throws SQLException {
            Student stu =new Student();
            stu.setId(rs.getInt(1));
            stu.setName(rs.getString(2));
            return stu;
        }
    };

    public List<Student> selectAll(){
        return jdbcTemplate.query("select * from student",rowMapper);
    }

}
