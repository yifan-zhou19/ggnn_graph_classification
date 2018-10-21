package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[100000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a = Integer.parseInt(tempVar3);
		 }
		 j = 0;
	for (i = 0;i < n;)
	{
			if (b[i] != a)
			{
				b[j] = b[i];
				j = j + 1;
				i = i + 1;
			}
			else
			{
				i = i + 1;
			}
	}
		m = j - 1;
		for (j = 0;j <= m - 1;j++)
		{
		System.out.printf("%ld ",b[j]);
		}
		System.out.printf("%ld",b[m]);
	}

}

