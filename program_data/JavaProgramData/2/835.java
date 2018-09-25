package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] b = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[30];
		int i;
		int j;
		int k;
		int n;
		int t = 0;
		int max;
		char[][] c = new char[1000][10];
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
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = tempVar3.charAt(0);
			}
			d[i] = (int)String.valueOf(c[i]).length();
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < d[i];j++)
		   {
			   for (k = 0;k < 26;k++)
			   {
				   if (c[i][j] == k + 65)
				   {
					   e[k] = e[k] + 1;
				   }
			   }
		   }
		}
		max = e[0];
		for (k = 1;k < 26;k++)
		{
			if (e[k] > max)
			{
				t = k;
				max = e[k];
			}
		}

		System.out.printf("%c\n",t + 65);
		System.out.printf("%d\n",e[t]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < d[i];j++)
			{
				if (c[i][j] == t + 65)
				{
					System.out.printf("%d\n",b[i]);
				}
			}
		}
	}


}

