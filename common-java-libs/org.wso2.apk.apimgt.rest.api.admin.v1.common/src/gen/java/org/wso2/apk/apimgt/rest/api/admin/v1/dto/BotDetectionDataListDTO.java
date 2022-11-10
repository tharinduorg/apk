package org.wso2.apk.apimgt.rest.api.admin.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.apk.apimgt.rest.api.admin.v1.dto.BotDetectionDataDTO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class BotDetectionDataListDTO   {
  
  private Integer count;

  private List<BotDetectionDataDTO> _list = null;


  /**
   * Number of Bot Detection Data returned. 
   **/
  public BotDetectionDataListDTO count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Number of Bot Detection Data returned. ")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   **/
  public BotDetectionDataListDTO _list(List<BotDetectionDataDTO> _list) {
    this._list = _list;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("list")
  public List<BotDetectionDataDTO> getList() {
    return _list;
  }
  public void setList(List<BotDetectionDataDTO> _list) {
    this._list = _list;
  }

  public BotDetectionDataListDTO addListItem(BotDetectionDataDTO _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotDetectionDataListDTO botDetectionDataList = (BotDetectionDataListDTO) o;
    return Objects.equals(count, botDetectionDataList.count) &&
        Objects.equals(_list, botDetectionDataList._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotDetectionDataListDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
