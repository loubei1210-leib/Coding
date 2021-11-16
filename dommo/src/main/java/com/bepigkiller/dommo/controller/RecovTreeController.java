package com.bepigkiller.dommo.controller;

import com.bepigkiller.dommo.service.RecovTreeService;
import com.bepigkiller.dommo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecovTreeController {
    @Autowired
    RecovTreeService treeService;

    @GetMapping("/tree")
    public R getTree(){
        return R.success(treeService.list());
    }
}
