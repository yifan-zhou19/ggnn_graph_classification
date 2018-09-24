package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i = 0;
		int j;
		int N;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		N = n * n;
		for (k = 0;k < N;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			if (p == 0)
			{
				i++;
			}
		}
		j = ((i / 4) - 1) * ((i / 4) - 1);
		System.out.printf("%d\n",j);
	}
}

