package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] f = new int[1000];
		int[] o = new int[1000];
		int s;
		int flag;
		int sign;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[i] = Integer.parseInt(tempVar3);
			}
			o[i] = s - f[i];
		}
		flag = 0;
		sign = 0;
		for (j = 0;j < n;j++)
		{
			for (k = n - 1;k > j;k--)
			{
				if (o[j] == f[k])
				{
					System.out.print("yes");
					flag = 1;
					sign = 1;
					break;
				}
			}
			if (sign == 1)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

