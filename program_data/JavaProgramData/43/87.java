package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] flag = new int[SIZE];
		int i;
		int j;
		int r;
		int num;
		for (i = 3;i < 32767;i++)
		{
			if (i % 2 == 1)
			{
				for (j = 2;j <= Math.sqrt(i);j++)
				{
					r = i % j;
					if (r == 0)
					{
						break;
					}
				}
				if (r != 0)
				{
					flag[i] = 1;
				}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= num / 2;i++)
		{
			if (flag[i] == 1 && flag[num - i] == 1)
			{
				System.out.printf("%d %d\n",i,num - i);
			}
			i++;
		}
		return 0;
	}
}

