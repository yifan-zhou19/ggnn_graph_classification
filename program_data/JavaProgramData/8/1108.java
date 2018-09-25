package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int a;
	public static int[] str1 = new int[10000];
	public static int[] str2 = new int[10000];
	public static void dosomething(int[] str, int q)
	{
		for (int i = 0;i < q - 1;i++)
		{
			for (int j = i + 1;j < q;j++)
			{
				if (str[i] > str[j])
				{
					a = str[i],str[i] = str[j],str[j] = a;
				}
			}
		}
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				str2[i] = Integer.parseInt(tempVar4);
			}
		}
		dosomething(str1, n);
		dosomething(str2, m);
		for (int i = 0;i < n;i++)
		{
			System.out.printf("%d ",str1[i]);
		}
		for (int i = 0;i < m;i++)
		{
			i == 0?System.out.printf("%d",str2[i]):printf(" %d",str2[i]);
		}

	}
}

