package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] b = new char[50][25];
		char[][] c = new char[50][25];
		int[] a = new int[50];
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b[i] = tempVar2.charAt(0);
		 }
		}
		for (i = 0;i < n;i++)
		{
			 a[i] = String.valueOf(b[i]).length();
			 k = a[i];
		 if (b[i][k - 1] == 'r' || b[i][k - 1] == 'y')
		 {
		   for (j = 0;j < k - 2;j++)
		   {
		   c[i][j] = b[i][j];
		   System.out.printf("%c",c[i][j]);
		   }
		 }
		 else if (b[i][k - 1] == 'g')
		 {
		   for (j = 0;j < k - 3;j++)
		   {
		   c[i][j] = b[i][j];
		   System.out.printf("%c",c[i][j]);
		   }
		 }
		 System.out.print("\n");
		}
	}

}

