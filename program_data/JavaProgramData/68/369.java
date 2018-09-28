package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int t;
		int a = 6;
		int a1;
		int a2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}



		while (a <= t)

		{
			for (a1 = 3;a1 <= a / 2;a1 += 2)
			{
			for (i = 3;i <= Math.sqrt(a1);i += 2)
			{
				if (a1 % i == 0)
				{
					break;
				}
			}

			if (i > Math.sqrt(a1))
			{
				a2 = a - a1;

				for (i = 3;i <= Math.sqrt(a2);i += 2)
				{
					if (a2 % i == 0)
					{
						break;
					}
				}
				if (i > Math.sqrt(a2))
				{
					System.out.printf("%d=%d+%d\n",a,a1,a2);
					a1 = a;
				}
			}

			}
		a = a + 2;
		}

	}
}

