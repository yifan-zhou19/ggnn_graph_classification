package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] year = new int[100];
		int i;
		int j;
		int[] year2 = new int[100];
		int t;
		int k;
		char[][] num = new char[100][10];
		char[][] num2 = new char[100][10];
		char p;
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
				num[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				year[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (year[i] >= 60)
			{
				for (k = 0;k < 10;k++)
				{
					num2[i][k] = num[i][k];
				}
			  year2[i] = year[i];
			}
		}
		for (j = 0;j < n - 1;j++)
		{
		   for (i = 0;i < n - j - 1;i++)
		   {
			   if (year2[i] < year2[i + 1])
			   {
				   t = year2[i];
				   year2[i] = year2[i + 1];
				   year2[i + 1] = t;
				for (k = 0;k < 10;k++)
				{
					 p = num2[i][k];
				   num2[i][k] = num2[i + 1][k];
				   num2[i + 1][k] = p;
				}
			   }
		   }
		}
		for (i = 0;i < n;i++)
		{
			if (year2[i] != 0)
			{
			System.out.printf("%s\n",num2[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (year[i] < 60)
			{
			System.out.printf("%s\n",num[i]);
			}
		}
		return 0;
	}

}

