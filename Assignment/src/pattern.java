package pattern;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=4;
		int l=0;

			for(int i =1; i<=no;i++) 
				{
					System.out.println();
					for(int j =1;j<=i;j++) 
					{
						System.out.print(j);
						l=j;
					}
					for(int k= l-1; k>0;k--) 
					{
						System.out.print(k);
					}
				}

			}

		}