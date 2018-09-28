package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a1 = 1;
		int a2 = 1;
		int i = 0;
		int a;
		int n;
		int e;
		int y = 0;
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
				e = Integer.parseInt(tempVar2);
			}
			a1 = 1;
			a2 = 1;
			if (e <= 2)
			{
				a = 1;
			}
			else
			{
			for (y = 0;y < e-2;y++)
			{
				a = a1 + a2;
				a1 = a2;
				a2 = a;
			}
			}
			System.out.printf("%d\n",a);

		}
	}

}

