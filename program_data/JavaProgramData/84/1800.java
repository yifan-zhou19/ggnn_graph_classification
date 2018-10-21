package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int i;
		for (i = 0;i < (n - 2);i++)
		{
			int k;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				k = Integer.parseInt(tempVar4);
			}
			if (k > a)
			{
				b = a;
				a = k;
			}
			else if (k > b)
			{
				b = k;
			}
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
	}
}

