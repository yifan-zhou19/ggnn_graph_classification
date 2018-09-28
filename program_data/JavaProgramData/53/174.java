package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] str = new int[300];
		int[] c = new int[300];
		m = 1;
		n = 0;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 300;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = Integer.parseInt(tempVar2);
			}
		}
		c[0] = str[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (j != i - 1)
				{
					if (str[i] == c[j])
					{
					break;
					}
				}
				else if (str[i] != c[j])
				{
					c[m] = str[i];
					m++;
				}
			}
		}


		for (i = 0;i < m;i++)
		{
			if (i < m - 1)
			{
				System.out.printf("%d,",c[i]);
			}
			else
			{
				System.out.printf("%d",c[i]);
			}
		}
	}


}

