package com.example.SpringJDBCEx.repo;

import com.example.SpringJDBCEx.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class studentRepo {


    private JdbcTemplate jdbc;

    public void save(student st) {
//section 11 rowmapper video in spring course for revising.
        String sql="insert into student (rollnum,name,marks) values(?,?,?)";
        int i=jdbc.update(sql, st.getRonum(), st.getName(),st.getMarks());
        System.out.println(i+" effected");
    }

    public List<student> findAll() {

       String sql="select * from student";
        RowMapper<student> mapper=new RowMapper<>() {


            @Override
            public student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student s=new student();
                s.setRonum(rs.getInt("rollnum"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }
        };
        return jdbc.query(sql,mapper);

    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
