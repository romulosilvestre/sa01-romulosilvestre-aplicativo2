package br.com.senaitagua.sa1.app2;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.HistoriaBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"anos:"+new HistoriaBO().calcularQtdeAno(2023,1968));
	}

}
