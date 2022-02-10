package com.water.quality.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 水质参数表
 * </p>
 *
 * @author 
 * @since 2022-02-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WqParam对象", description="水质参数表")
public class WqParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "水质类别id")
    private Integer wqTypeId;

    @ApiModelProperty(value = "水质参数类别id")
    private Integer wqParamTypeId;

    @ApiModelProperty(value = "最大浓度阈值")
    private Double maxConcentration;

    @ApiModelProperty(value = "最小浓度阈值")
    private Double minConcentration;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建人id")
    private Integer creatorId;

    @ApiModelProperty(value = "更新人id")
    private Integer editorId;


}
