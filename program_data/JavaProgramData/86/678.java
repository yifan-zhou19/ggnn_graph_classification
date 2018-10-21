package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int a;
		int total = 0;
		int b;
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
							m = Integer.parseInt(tempVar2);
						}
						if (m == 0)
						{
							System.out.print("60\n");
						}
						else
						{
						for (j = 1;j <= m;j++)
						{
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								a = Integer.parseInt(tempVar3);
							}
						if (total < 60)
						{
							total = a + 3 * j;
						b = j;
						}
						}
						if (total <= 62 && total >= 60)
						{
							total -= 3 * b;

						}
						else if (total < 60)
						{
							total = 60 - 3 * m;

						}
						else
						{
							total = 60 - 3 * (b - 1);

						}
						System.out.printf("%d\n",total);
						}
		}

		return 0;
	}

}

