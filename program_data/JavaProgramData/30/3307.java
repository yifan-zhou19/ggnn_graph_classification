package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0 && (i - 7) % 10 != 0)
			{
				if (i >= 70 && i / 10 != 7)
				{
					sum += i * i;
				}
				else if (i < 70)
				{
					sum += i * i;
				}
			}
		}
		System.out.printf("%d",sum);
	}

}

