package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[100];
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		num[99] = 1;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 100;i++)
			{
				 num[i] *= 2;
				 if (num[i] > 9)
				 {
					 num[i] -= 10;
					 num[i - 1] += 1;
				 }
			}
		}
		j = 0;
		for (i = 0;i < 100;i++)
		{
			if (num[i] != 0)
			{
				j++;
			}
			if (j != 0)
			{
				System.out.printf("%d",num[i]);
			}
		}
		 return 0;
	}
}

