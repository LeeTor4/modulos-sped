package modulos.efdicms.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RegC100 {

	private Long      Id;
	private Long      IdPai;
	private String    reg;
	private String    IndOper;
	private String    IndEmit;
	private String    codPart;
	private String    codMod;
	private String    codSit;
	private String    ser;
	private String    numDoc;
	private String    chvNfe;
	private LocalDate dtDoc;
	private LocalDate dtEntSai;
	private Double    vlDoc;
	private String    indPgto;
	private Double    vlDesc;
	private Double    vlAbatNt;
	private Double    vlMerc;
	private String    indFrt;
	private Double    vlFrt;
	private Double    vlSeg;
	private Double    vlOutDa;
	private Double    vlBcIcms;
	private Double    vlIcms;
	private Double    vlBcIcmsSt;
	private Double    vlIcmsSt;
	private Double    vlIpi;
	private Double    vlPis;
	private Double    vlCofins;
	private Double    vlPisSt;
	private Double    vlCofinsSt;
	
	private List<RegC170> produtosSped = new ArrayList<RegC170>();
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getIdPai() {
		return IdPai;
	}
	public void setIdPai(Long idPai) {
		IdPai = idPai;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getIndOper() {
		return IndOper;
	}
	public void setIndOper(String indOper) {
		IndOper = indOper;
	}
	public String getIndEmit() {
		return IndEmit;
	}
	public void setIndEmit(String indEmit) {
		IndEmit = indEmit;
	}
	public String getCodPart() {
		return codPart;
	}
	public void setCodPart(String codPart) {
		this.codPart = codPart;
	}
	public String getCodMod() {
		return codMod;
	}
	public void setCodMod(String codMod) {
		this.codMod = codMod;
	}
	public String getCodSit() {
		return codSit;
	}
	public void setCodSit(String codSit) {
		this.codSit = codSit;
	}
	public String getSer() {
		return ser;
	}
	public void setSer(String ser) {
		this.ser = ser;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public String getChvNfe() {
		return chvNfe;
	}
	public void setChvNfe(String chvNfe) {
		this.chvNfe = chvNfe;
	}
	public LocalDate getDtDoc() {
		return dtDoc;
	}
	public void setDtDoc(LocalDate dtDoc) {
		this.dtDoc = dtDoc;
	}
	public LocalDate getDtEntSai() {
		return dtEntSai;
	}
	public void setDtEntSai(LocalDate dtEntSai) {
		this.dtEntSai = dtEntSai;
	}
	public Double getVlDoc() {
		return vlDoc;
	}
	public void setVlDoc(Double vlDoc) {
		this.vlDoc = vlDoc;
	}
	public String getIndPgto() {
		return indPgto;
	}
	public void setIndPgto(String indPgto) {
		this.indPgto = indPgto;
	}
	public Double getVlDesc() {
		return vlDesc;
	}
	public void setVlDesc(Double vlDesc) {
		this.vlDesc = vlDesc;
	}
	public Double getVlAbatNt() {
		return vlAbatNt;
	}
	public void setVlAbatNt(Double vlAbatNt) {
		this.vlAbatNt = vlAbatNt;
	}
	public Double getVlMerc() {
		return vlMerc;
	}
	public void setVlMerc(Double vlMerc) {
		this.vlMerc = vlMerc;
	}
	public String getIndFrt() {
		return indFrt;
	}
	public void setIndFrt(String indFrt) {
		this.indFrt = indFrt;
	}
	public Double getVlFrt() {
		return vlFrt;
	}
	public void setVlFrt(Double vlFrt) {
		this.vlFrt = vlFrt;
	}
	public Double getVlSeg() {
		return vlSeg;
	}
	public void setVlSeg(Double vlSeg) {
		this.vlSeg = vlSeg;
	}
	public Double getVlOutDa() {
		return vlOutDa;
	}
	public void setVlOutDa(Double vlOutDa) {
		this.vlOutDa = vlOutDa;
	}
	public Double getVlBcIcms() {
		return vlBcIcms;
	}
	public void setVlBcIcms(Double vlBcIcms) {
		this.vlBcIcms = vlBcIcms;
	}
	public Double getVlIcms() {
		return vlIcms;
	}
	public void setVlIcms(Double vlIcms) {
		this.vlIcms = vlIcms;
	}
	public Double getVlBcIcmsSt() {
		return vlBcIcmsSt;
	}
	public void setVlBcIcmsSt(Double vlBcIcmsSt) {
		this.vlBcIcmsSt = vlBcIcmsSt;
	}
	public Double getVlIcmsSt() {
		return vlIcmsSt;
	}
	public void setVlIcmsSt(Double vlIcmsSt) {
		this.vlIcmsSt = vlIcmsSt;
	}
	public Double getVlIpi() {
		return vlIpi;
	}
	public void setVlIpi(Double vlIpi) {
		this.vlIpi = vlIpi;
	}
	public Double getVlPis() {
		return vlPis;
	}
	public void setVlPis(Double vlPis) {
		this.vlPis = vlPis;
	}
	public Double getVlCofins() {
		return vlCofins;
	}
	public void setVlCofins(Double vlCofins) {
		this.vlCofins = vlCofins;
	}
	public Double getVlPisSt() {
		return vlPisSt;
	}
	public void setVlPisSt(Double vlPisSt) {
		this.vlPisSt = vlPisSt;
	}
	public Double getVlCofinsSt() {
		return vlCofinsSt;
	}
	public void setVlCofinsSt(Double vlCofinsSt) {
		this.vlCofinsSt = vlCofinsSt;
	}
	
	public void adicionaProdutos(RegC170 regC170) {
		produtosSped.add(regC170);
	}
	
	public List<RegC170> getProdutosNota() {
		return produtosSped;
	}
	

}
