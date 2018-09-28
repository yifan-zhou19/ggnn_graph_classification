package <missing>;

public class GlobalMembers
{
	/*
	????????
	?????2010/11/26
	????00948344
	????????c??????
	*/


	//???????????????????


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[100][100];
		a[0] = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len;
		 for (i = 0;i < n;i++)
		 {
		a[i] = new Scanner(System.in).nextLine();
		 }
		for (i = 0;i < n;i++)
		{
		  len = String.valueOf(a[i]).length();
		  for (j = 0;j < len;j++)
		  {
			  if (j == 0)
			  {
				  if ((a[i][0] < 'a' || a[i][0]>'z') && (a[i][0] < 'A' || a[i][0]>'Z') && a[i][0] != '_')
				  {
					  System.out.print('0');
					  System.out.print("\n");
					  break;
				  }
			  }
			  else
			  {
				  if (((a[i][j] < 'a' || a[i][j]>'z') && (a[i][j] < 'A' || a[i][j]>'Z') && (a[i][j] < '0' || a[i][j]>'9')) && a[i][j] != '_')
				  {
					  System.out.print('0');
					  System.out.print("\n");
					  break;
				  }
			  }
		  }
		  if (j == len)
		  {
			  System.out.print('1');
			  System.out.print("\n");
		  }
		}
	}
}

