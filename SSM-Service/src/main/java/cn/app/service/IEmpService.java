package cn.app.service;

import cn.app.domain.Emp;

import java.util.List;

public interface IEmpService {
    List<Emp> getAllEmp();
    int insertEmp();
    Emp getEmp(short id);
}
