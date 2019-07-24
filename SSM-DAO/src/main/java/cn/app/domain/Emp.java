package cn.app.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Emp implements Serializable {
    @Id
    @Column(name = "EMPNO")
    private Short empno;

    @Column(name = "ENAME")
    private String ename;

    @Column(name = "JOB")
    private String job;

    @Column(name = "MGR")
    private Short mgr;

    @Column(name = "HIREDATE")
    private Date hiredate;

    @Column(name = "SAL")
    private BigDecimal sal;

    @Column(name = "COMM")
    private BigDecimal comm;

    @Column(name = "DEPTNO")
    private Short deptno;

    private static final long serialVersionUID = 1L;

    /**
     * @return EMPNO
     */
    public Short getEmpno() {
        return empno;
    }

    /**
     * @param empno
     */
    public void setEmpno(Short empno) {
        this.empno = empno;
    }

    /**
     * @return ENAME
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * @return JOB
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * @return MGR
     */
    public Short getMgr() {
        return mgr;
    }

    /**
     * @param mgr
     */
    public void setMgr(Short mgr) {
        this.mgr = mgr;
    }

    /**
     * @return HIREDATE
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * @param hiredate
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * @return SAL
     */
    public BigDecimal getSal() {
        return sal;
    }

    /**
     * @param sal
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /**
     * @return COMM
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * @param comm
     */
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    /**
     * @return DEPTNO
     */
    public Short getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(Short deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empno=").append(empno);
        sb.append(", ename=").append(ename);
        sb.append(", job=").append(job);
        sb.append(", mgr=").append(mgr);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", sal=").append(sal);
        sb.append(", comm=").append(comm);
        sb.append(", deptno=").append(deptno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}