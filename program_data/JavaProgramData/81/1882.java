package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int num1 = 0;
		int num2 = 0;
		int temp;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 0 && n <= 4)
		{
			num1++;
		}
		if (m >= 0 && m <= 4)
		{
			num2++;
		}
	   if (num1 == 0 || num2 == 0)
	   {
		   System.out.print("error");
	   }
	   else if (num1 != 0 && num2 != 0)
	   {
		   for (i = 0;i < 5;i++)
		   {
			   temp = a[n][i];
				 a[n][i] = a[m][i];
				 a[m][i] = temp;
		   }
		   for (i = 0;i < 5;i++)
		   {
			 for (j = 0;j < 4;j++)
			 {
				 System.out.printf("%d ",a[i][j]);
			 }
		   System.out.printf("%d\n",a[i][4]);
		   }
	   }
	   return 0;
	}
}

