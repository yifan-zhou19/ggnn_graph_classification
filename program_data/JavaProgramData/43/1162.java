package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????????? **
	//*????? 1300012839 **
	//*???2013.10.27**
	//********************************
	public static int Main()
	{
		 int m; //m??????a?b?????i?j?????
		 int a;
		 int b;
		 int i;
		 int j;
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (a = 3;a <= m / 2;a += 2) //a?3??????
		 {
				 for (i = 2;i < a;i++) //??a?????
				 {
					 if (a % i == 0)
					 {
						 break;
					 }
				 }
				 if (i == a)
				 {
				  b = m - a; //??a??????b?????
				  for (j = 2;j < b;j++)
				  {
					 if (b % j == 0)
					 {
						 break;
					 }
				  }
					if (b == j)
					{
						System.out.print(a);
						System.out.print(" ");
						System.out.print(b);
						System.out.print("\n");
					}
				 }
		 }
			 return 0;
	}
}

