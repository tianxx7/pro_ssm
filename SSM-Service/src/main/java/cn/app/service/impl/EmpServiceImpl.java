package cn.app.service.impl;

import cn.app.domain.Emp;
import cn.app.mapper.EmpMapper;
import cn.app.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public List<Emp> getAllEmp() {
        return empMapper.selectAll();
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public int insertEmp() {
        int i = empMapper.insertEmp();
        //int a = 1/0;
        return i;
    }

    @Override
    public Emp getEmp(short id) {
        Emp emp = empMapper.getEmp(id);
        return emp;
    }
}
