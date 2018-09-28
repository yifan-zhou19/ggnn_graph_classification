package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{


		int sum = 0;
		int m;
		int i;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = n;i >= 1;i--)
		{
			m = i / 10;
				if (i % 7 == 0)
				{
					continue;
				}
				if (i % 10 == 7)
				{
					continue;
				}
				if (m % 10 == 7)
				{
					continue;
				}
				if (m % 10 != 7 || i % 10 != 7 || i % 7 != 0)
				{
					sum += i * i;
				}
		}

			System.out.printf("%d",sum);
	}


}

