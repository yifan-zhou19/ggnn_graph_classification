package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] c1 = new int[301];
		int[] c2 = new int[300];
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
				c1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (c1[i] == c1[j])
				{
					c2[j] = 1;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (c2[i] != 1)
			{
				printf(i == 0?"%d":",%d",c1[i]);
			}
		}
	}
}

