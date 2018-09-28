package <missing>;

public class GlobalMembers
{
	public static int prime(int i)
	{
		int j;
		int f = 1;
		for (j = 2;j * j <= i;j++)
		{
			if (i % j == 0)
			{
				f = 0;
				break;
			}
		}
		return f;

	}

	public static int hw(int i)
	{
		int r = i;
		int j = 0;
		for (;;)
		{
			j = j * 10 + i % 10;
			i = i / 10;
			if (i == 0)
			{
				break;
			}


		}
		if (j == r)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = m,j = 0;i <= n;i++)
		{
			if (hw(i) == 1 && prime(i) == 1)
			{
				j++;

				if (j != 1)
				{
					System.out.print(",");
				}
				System.out.printf("%ld",i);

			}
		}
		if (j == 0)
		{
			System.out.print("no\n");
		}



	}
}

