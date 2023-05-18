package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.ResponseObjects.GetSalaryResponse;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @RequestMapping("salary/create")
    public void saveSalary (@RequestBody Long salaryRequestObject ) {
        createSalary(salaryRequestObject);
    }
    @RequestMapping("salary/get")
    public List<Salary> getSalary () {
        return salaryService.getSalary();
    }
    @RequestMapping("salary/get/{salaryId}")
    public GetSalaryResponse createSalary (@PathVariable Long salaryId)
    {
        return salaryService.getSalaryById(salaryId);
    }
    public void createSalary() {

        Salary salary = new Salary();
        salary.setAmount(600.0);
        salary.setBonus(50.0);
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salary.setAllowances(50);
        salary.setOverTimeAmount(50.0);
        salary.setDeductions(50.0);
        salary.setCurrency("Dollar");
        salary.setHealthCareContribution(50.0);
        salaryService.saveSalary(salary);
    }

}