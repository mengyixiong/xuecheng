package com.liuzhuo.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {
    //当前页码
    @ApiModelProperty("当前页码")
    private Long page = 1L;

    //每页记录数默认值
    @ApiModelProperty("每页记录数默认值")
    private Long size = 10L;
}
