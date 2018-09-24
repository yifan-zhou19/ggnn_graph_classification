package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] num = new int[300];
		int[] mark = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			num[i] = m;
			mark[i] = 0;
			j = i - 1;
			while ((j >= 0) && (num[j] != num[i]))
			{
				j--;
			}
			if (num[j] == num[i])
			{
				mark[i] = 1;
			}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;++i)
		{
			if (mark[i] == 0)
			{
				System.out.printf(",%d",num[i]);
			}
		}

	}

}

