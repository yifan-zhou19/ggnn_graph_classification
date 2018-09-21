package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int n;
		int m;
		int[] num = new int[300];
		int sub;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", num[i]))
		{
			i++;
		}
		n = i;
		m = num[0];
		for (i = 1;i < n;i++)
		{
			if (m < num[i])
			{
				m = num[i];
			}
			flag = 1;
		}
		if (flag == 0)
		{
			System.out.print("No");
			return 0;
		}
		sub = 0;
		for (i = 0;i < n;i++)
		{
			if (num[i] == m)
			{
				continue;
			}
			if ((sub < num[i]))
			{
				sub = num[i];
			}
		}


		if (sub != 0)
		{
			System.out.printf("%d",sub);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

