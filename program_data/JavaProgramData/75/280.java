package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int k;
		int j;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[1000];
		char a;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a != '\n')
		{
			if (a != ',')
			{
			 x[i] = x[i] * 10 + a - '0';
			}
			else
			{
				i++;
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			a = tempVar3.charAt(0);
		}
		i = 0;
		while (a != '\n')
		{
			if (a != ',')
			{
			 y[i] = y[i] * 10 + a - '0';
			}
			else
			{
				i++;
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				a = tempVar4.charAt(0);
			}
		}
		System.out.printf("%d ",i + 1);
		k = i;
		for (j = 0;j <= k;j++)
		{
				for (i = x[j];i <= y[j] - 1;i++)
				{
					t[i] += 1;
				}
		}
		i = 0;
		for (j = 1;j <= 999;j++)
		{
		  if (t[j] > t[i])
		  {
			  i = j;
		  }
		}
		System.out.printf("%d\n",t[i]);

	}

}

