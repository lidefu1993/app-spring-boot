package com.ldf.app.utils;

import com.ldf.common.excel.imp.AbstractImportExcel;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lidefu
 * @date 2020年05月18日19:05
 **/
public class DemoImportExcel extends AbstractImportExcel<DemoImportExcelData> {
    @Override
    protected void sheetCheck(Sheet sheet) {

    }

    @Override
    protected List<DemoImportExcelData> sheetData(Sheet sheet) {
        List<DemoImportExcelData> dataList = new ArrayList<>();
        sheet.rowIterator().forEachRemaining(row -> {
            String v1 = cellStringValue(row, 0);
            String v2 = cellStringValue(row, 1);
            DemoImportExcelData data = new DemoImportExcelData().ofName(v1).ofMsg(v2);
            dataList.add(data);
        });
        return dataList;
    }

    @Override
    protected void dataCheck(List<DemoImportExcelData> list) {

    }
}
