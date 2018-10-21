package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   char[][] a = new char[20][100];
		   char[][] b = new char[20][100];
		   char[][] c = new char[20][100];
		   int i;
		   int len1;
		   int len2;
		   int d;
		   int n;
		   int cycle;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   for (cycle = 0;cycle < n;cycle++)
		   {
			 a[cycle] = new Scanner(System.in).nextLine();
			 b[cycle] = new Scanner(System.in).nextLine();
			 scanf("\n");
			 len1 = String.valueOf(a[cycle]).length();
			 len2 = String.valueOf(b[cycle]).length();
			 d = len1 - len2;

		   for (i = len1 - 1;i >= 0;i--)
		   {
			   if (i >= d)
			   {
			   c[cycle][i] = a[cycle][i] - b[cycle][i - d] + 48;
			   if (a[cycle][i] < b[cycle][i - d])
			   {
				   a[cycle][i - 1] = a[cycle][i - 1] - 1;
				   c[cycle][i] += 10;
			   }
			   }
			   else
			   {
				   c[cycle][i] = a[cycle][i];
			   }
		   }
		   len2 = 0;
		   d = 0;
		   i = 0;
		   len1 = 0;
		   }
		   int j;
		   for (j = 0;j < n;j++)
		   {

			   System.out.printf("%s\n",c[j]);
		   }


	}

}

