/*
uppgift5.1 i boken
skapat 2019-10-10
*/
import javax.swing.*;
/*
public class uppgift5_1{
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("n?");
		int n = Integer.parseInt (s);
		int summa = 0;
		int k = 1;
		while (k <= n){
			summa = summa + k;
			k = k +1;
		}
		JOptionPane.showMessageDialog(null,
									"summan bli " + summa);
	}
}
*/
public class uppgift5_1{
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("n?");
		int n = Integer.parseInt (s);
		int summa = 0;
		int k = 1;
			while (k <= n) {
				summa = summa + k*k;
				k= k + 1;
			}
			JOptionPane.showMessageDialog(null, "summan blir" + summa);
	}
}