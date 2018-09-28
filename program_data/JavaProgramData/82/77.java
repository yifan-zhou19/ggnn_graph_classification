package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int n;
		int[] c = new int[100];
		int j = 0;
		int k;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			c[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (89 < a && a < 141 && 59 < b && b < 91)
			{
				c[j]++;
			}
			else
			{
				j++;
			}
		}
		for (k = 0;k < j + 1;k++)
		{
			if (c[k] > max)
			{
				max = c[k];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}


}

