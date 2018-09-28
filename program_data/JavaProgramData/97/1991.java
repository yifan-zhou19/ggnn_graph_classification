package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}

		i = 0;
		if (q >= 100)
		{
			for (i = 0;q >= 100;i++)
			{
				q -= 100;
			}
		}
		System.out.printf("%d\n",i);
		i = 0;

		if (q >= 50)
		{

			for (i = 0;q >= 50;i++)
			{
				q -= 50;
			}

		}

		System.out.printf("%d\n",i);
		i = 0;


		if (q >= 20)
		{

			for (i = 0;q >= 20;i++)
			{
				q -= 20;
			}

		}

		System.out.printf("%d\n",i);
		i = 0;


		if (q >= 10)
		{
			for (i = 0;q >= 10;i++)
			{
				q -= 10;
			}

		}
		System.out.printf("%d\n",i);
		i = 0;


		if (q >= 5)
		{

			for (i = 0;q >= 5;i++)
			{
				q -= 5;
			}
		}
		System.out.printf("%d\n",i);
		i = 0;

		System.out.printf("%d",q);

		return 0;
	}
}

