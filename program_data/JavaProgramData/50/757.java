package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 12;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 1;i <= 12;i++)
			{
			if (i == 1)
			{
				sum += 0;
			}
			if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11)
			{
				sum += 31;
			}
			else if (i == 5 || i == 7 || i == 10 || i == 12)
			{
				sum += 30;
			}
			else
			{
				sum += 28;
			}
			a = sum % 7;
			b = a + n;
			if (b > 7)
			{
				b = b - 7;
			}
			if (b == 5)
			{
			System.out.printf("%d\n",i);
			}
			}
		return 0;
	}

}

