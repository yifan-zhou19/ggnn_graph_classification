package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int sum;
		int i;
		int s;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0)
			{
				g = i % 10;
				s = i / 10;
				if (g != 7 && s != 7)
				{
					sum = sum + i * i;
				}
			}
		}
		System.out.printf("%d",sum);
	}

}

