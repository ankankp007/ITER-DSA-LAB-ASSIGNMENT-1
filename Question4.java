package LabAssignment;

public class Question4 {


	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		char str[]= {'c','a','r','b','o','n'};
		for( int i =0;i<str.length;i++) {
			for( int j =0;j<str.length;j++) {
				for( int k =0;k<str.length;k++) {
					for( int l =0;l<str.length;l++) {
						for( int m =0;m<str.length;m++) {
							for( int n =0;n<str.length;n++) {
								if((i!=j) && (i!=k) &&( i!=l)&&(i!=m)&&(i!=n)&&(j!=k)&&(j!=l)&&(j!=m)&&(j!=n)&&(k!=l)&&(k!=m)&&(k!=n)&&(k!=n)&&(l!=m)&&(l!=n)&&(m!=n)) {
									System.out.println(str[i]+""+ str[j]+""+str[k]+""+str[l]+""+str[m]+""+str[n]);
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);   

	}
}






