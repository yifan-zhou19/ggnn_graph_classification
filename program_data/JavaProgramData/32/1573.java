package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int k;
		int t;
		int r = 0;
		int h;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int[] s = new int[100];
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (i = 0;i < j;i++)
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
	   System.in.read();
	   x[i] = String.valueOf(a[i]).length();
	   y[i] = String.valueOf(b[i]).length();
		}
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < y[i];k++)
			{
				if (a[i][x[i] - k - 1] >= b[i][y[i] - k - 1])
				{
					a[i][x[i] - k - 1] = a[i][x[i] - k - 1] - b[i][y[i] - k - 1] + '0';
				}
				else
				{
					a[i][x[i] - k - 1] = a[i][x[i] - k - 1] - b[i][y[i] - k - 1] + 10 + '0';
					a[i][x[i] - k - 2] = a[i][x[i] - k - 2] - 1;
				}
			}
		}
		 for (i = 0;i < j;i++)
		 {
			 System.out.printf("%s\n",a[i]);
		 }







	}





}

