package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int k;
		int r;
		int[] flag = new int[SIZE];
		for (i = 0;i < 30000;i++)
		{
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				r = i % j;
				if (r == 0)
				{
					flag[i] = 0;
					break;
				}
			}
			if (r != 0)
			{
				flag[i] = 1;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (k = 3;k < num - 1;k++)
			{
				if (flag[k] == 1 && flag[k + 2] == 1)
				{
					System.out.printf("%d %d\n",k,k + 2);
				}
			}
		}
		return 0;
	}
}

