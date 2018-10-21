package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int secondmax = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (secondmax >= num[i])
			{
				secondmax = secondmax;
			}
			else if (num[i] == max)
			{
				secondmax = secondmax;
			}
			else
			{
				secondmax = num[i];
			}
		}
		System.out.printf("%d\n%d\n",max,secondmax);
		return 0;
	}


}

