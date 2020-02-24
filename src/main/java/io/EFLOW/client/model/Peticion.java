package io.EFLOW.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Peticion {
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;
  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;
  public Peticion folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "000012", value = "Es el identificador de la consulta realizada por parte del cliente. Este folio se regresa de manera integra en el elemento respuesta.")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public Peticion tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "1", required = true, value = "<table><thead><tr>Tipo de documento que corresponde al número de documento que se quiere consultar</tr><tr><th>Tipo documento</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>DNI</td></tr><tr><td>2</td><td>Carnet de extranjería</td></tr><tr><td>10</td><td>RUC</td></tr></tbody></table>")
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public Peticion numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "67544489", required = true, value = "Numero de documento de la persona que se quiera evaluar")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peticion peticion = (Peticion) o;
    return Objects.equals(this.folio, peticion.folio) &&
        Objects.equals(this.tipoDocumento, peticion.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, peticion.numeroDocumento);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folio, tipoDocumento, numeroDocumento);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peticion {\n");
    
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
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
