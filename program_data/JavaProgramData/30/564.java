package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		sum = 0;
			while (i <= n)
			{
			a = i / 10;
			b = i % 10;
				if (i % 7 == 0 || a == 7 || b == 7)
				{
					sum = sum;
				}
				else
				{
					sum += i * i;
				}

				i++;
			}
			System.out.printf("%d\n",sum);

		return 0;
	}
}

