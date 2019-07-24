package cn.app.mapper;

import cn.app.domain.Emp;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository("empMapper")
public interface EmpMapper extends Mapper<Emp> {
    List<Emp> selectAll();
   int insertEmp();
   Emp getEmp(short id);
}