package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] str = new int[100];
		str[1] = 1;
		str[2] = 1;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				System.out.print("1\n");
			}
			else
			{
			for (j = 3;j <= a;j++)
			{
				str[j] += str[j - 1] + str[j - 2];
			}
			System.out.printf("%d\n",str[a]);
			for (k = 3;k <= a;k++)
			{
				str[k] = 0;
			}
			}
		}

	}

}

