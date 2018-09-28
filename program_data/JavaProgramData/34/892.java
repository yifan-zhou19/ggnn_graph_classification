package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n;
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
				for (;1 < a;)
				{
					if (a == 1)
					{
						break;
					}
					else
					{
					if (a % 2 == 0)
					{
						b = a;
						a = a / 2;
						System.out.printf("%d/2=%d",b,a);
						System.out.print("\n");
					}
					else
					{
					if (a % 2 == 1)
					{
						b = a;
						a = a * 3 + 1;
						System.out.printf("%d*3+1=%d",b,a);
						System.out.print("\n");
					}

					}

					}
				}
				System.out.print("End");
		}

		return 0;
	}
}

