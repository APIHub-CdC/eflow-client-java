package io.EFLOW.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class Respuesta {
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("numConsulta")
  private BigDecimal numConsulta = null;
  @SerializedName("ingresoEstimado")
  private BigDecimal ingresoEstimado = null;
  public Respuesta folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "000012", value = "Es el identificador Ω de la consulta realizada por parte del cliente. Este folio se regresa de manera integra en el elemento respuesta.")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public Respuesta numConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "12345.0", value = "Número de único que identifica a la consulta realizada por parte de circulo de crédito")
  public BigDecimal getNumConsulta() {
    return numConsulta;
  }
  public void setNumConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
  }
  public Respuesta ingresoEstimado(BigDecimal ingresoEstimado) {
    this.ingresoEstimado = ingresoEstimado;
    return this;
  }
   
  @ApiModelProperty(example = "17200s", value = "Ingreso estimado puntual de la persona buscada")
  public BigDecimal getIngresoEstimado() {
    return ingresoEstimado;
  }
  public void setIngresoEstimado(BigDecimal ingresoEstimado) {
    this.ingresoEstimado = ingresoEstimado;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folio, respuesta.folio) &&
        Objects.equals(this.numConsulta, respuesta.numConsulta) &&
        Objects.equals(this.ingresoEstimado, respuesta.ingresoEstimado);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folio, numConsulta, ingresoEstimado);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
    sb.append("    ingresoEstimado: ").append(toIndentedString(ingresoEstimado)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
