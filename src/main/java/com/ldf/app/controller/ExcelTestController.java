package com.ldf.app.controller;

import com.ldf.app.utils.DemoImportExcel;
import com.ldf.app.utils.DemoImportExcelData;
import com.ldf.common.excel.exp.ExcelHeader;
import com.ldf.common.excel.exp.XlsxExportExcel;
import com.ldf.common.excel.imp.AbstractImportExcel;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lidefu
 * @date 2020年05月18日10:21
 **/
@RestController
@RequestMapping
public class ExcelTestController {

    @PostMapping("import")
    public Object imp(@RequestParam("file") MultipartFile file) throws IOException {
        DemoImportExcel demoImportExcel = new DemoImportExcel();
        return demoImportExcel.excelData(file);
    }

    @GetMapping("exportXlsx")
    public void expXlsx(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> mapList = new ArrayList<>();
        mapList.add(new HashMap<String, Object>(2){{
            put("name", "张三");
            put("msg", "大佬");
        }});
        mapList.add(new HashMap<String, Object>(2){{
            put("name", "李四");
            put("msg", "大佬");
        }});
        List<ExcelHeader> headerList = new ArrayList<>();
        ExcelHeader header1 = new ExcelHeader(); header1.setKey("name");header1.setMsg("姓名");header1.setWeight(ExcelHeader.BASE);
        headerList.add(header1);
        ExcelHeader header2 = new ExcelHeader(); header1.setKey("msg");header1.setMsg("描述");header1.setWeight(ExcelHeader.BASE);
        headerList.add(header2);
        XlsxExportExcel<Map<String, Object>> xlsxExportExcel = new XlsxExportExcel<>(mapList, headerList, "文件名", request, response);
        xlsxExportExcel.export();
    }

    @GetMapping("exportXls")
    public void exportXls(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

}
