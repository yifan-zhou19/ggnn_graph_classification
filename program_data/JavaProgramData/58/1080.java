package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String z = new String(new char[1]);
		  z = new Scanner(System.in).nextLine();
		  n = Integer.parseInt(z);
		  int i;
		  int j;
		  char[][] a = new char[2][100000];
		  for (i = 0;i < n;i++)
		  {
				 a[0] = new Scanner(System.in).nextLine();
				 int t;
				 t = String.valueOf(a[0]).length();
				 if (a[0][0] - '_' == 0 || (a[0][0] >= 'a' && a[0][0] <= 'z') || (a[0][0] >= 'A' && a[0][0] <= 'Z'))
				 {
						   for (j = 1;j < t;j++)
						   {
								 if (!((a[0][j] >= 'a' && a[0][j] <= 'z') || (a[0][j] - '_' == 0) || (a[0][j] >= '0' && a[0][j] <= '9') || (a[0][j] >= 'A' && a[0][j] <= 'Z')))
								 {
								 break;
								 }
						   }
				  if (j == t)
				  {
					  System.out.print("1\n");
				  }
				  else
				  {
					  System.out.print("0\n");
				  }
				 }
			 else
			 {
				 System.out.print("0\n");
			 }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}
