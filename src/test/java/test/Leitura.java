package test;

import java.nio.file.Path;
import java.nio.file.Paths;

import modulos.efdicms.entidades.Reg0150;
import modulos.efdicms.entidades.Reg0200;
import modulos.efdicms.entidades.RegC100;
import modulos.efdicms.entidades.RegC170;
import modulos.efdicms.manager.LeitorEfdIcms;



public class Leitura {

	public static void main(String[] args) {
		
		String ano = "2013";
		String cnpj = "05329222000338";
		String emp = "SELLENE";
		String estab = "LOJA03";
		
		String anomes1 = ano.concat("01").concat(".txt");
		
	    Path p1 = Paths.get("D:\\EMPRESAS".concat("\\").concat(emp).concat("\\").concat(estab).concat("\\SPED").concat("\\").concat(ano).concat("\\").concat(anomes1));

	     
		LeitorEfdIcms leitor = new LeitorEfdIcms();		
		leitor.leitorSpedFiscal(p1, null,1L,0L);
		
//		for(Reg0200 part : leitor.getRegs0200()){
//		     System.out.println(part.getId()+"|"+part.getIdPai()+"|"+part.getDescrItem());
//	    }
		
		
//		for(Reg0150 part : leitor.getRegs0150()){
//			System.out.println(part.getId()+"|"+part.getIdPai()+"|"+part.getNome());
//		}

		for(RegC100 nota : leitor.getRegsC100()){
			
			for(RegC170 p : nota.getProdutosNota()){
				
				System.out.println(nota.getId()+"|"+nota.getIdPai()+"|"+nota.getChvNfe()+"|"+p.getCodItem()
				        +"|"+p.getCfop()+"|"+p.getCstIcms().substring(0,1)+"|"+p.getCstIcms().substring(1,3));
			}
		}
		
	}
}
