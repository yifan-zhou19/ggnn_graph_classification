package <missing>;

public class GlobalMembers
{
	public static void moin(String[] a, String[] b, int k)
	{
		int c;
		int d;
		int e;
		int f;
		int i;
		int j;
		char[][] x = new char[10][100];
		c = a[k].length();
		d = b[k].length();
		e = 0;
		for (i = c - 1;i >= c - d;i--)
		{
			f = (a[k][i] - 48) - (b[k][i - c + d] - 48) + e;
		 if (f >= 0)
		 {
			 e = 0;
		 }
		 else
		 {
			 e = -1;
			 f = f + 10;
		 }
		 x[k][i] = f + 48;
		}
		for (i = c - d - 1;i >= 0;i--)
		{
			f = a[k][i] - 48 + e;
		 if (f >= 0)
		 {
			 e = 0;
		 }
		 else
		 {
			 e = -1;
			 f = f + 10;
		 }
		 x[k][i] = f + 48;
		}
		for (i = 0;x[k][i] == '0';i++)
		{
			;
		}
		for (j = i;j <= c - 1;j++)
		{
		   System.out.printf("%c",x[k][j]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{
	   int n;
	   int i;
	   char[][] a = new char[10][100];
	   char[][] b = new char[10][100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[i] = tempVar3.charAt(0);
		   }
		System.out.print("\n");
	   }
		for (i = 0;i <= n - 1;i++)
		{
		   moin(a, b, i);
		}
	   return (0);
	}
}

