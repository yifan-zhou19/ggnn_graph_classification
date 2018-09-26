package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 1;i <= n;i++)
		{
			a = i / 10;
			b = i % 10;
			if (i % 7 == 0 || a == 7 || b == 7)
			{
				continue;
			}
			sum = sum + i * i;
		}
		System.out.printf("%d\n",sum);
	}


}

