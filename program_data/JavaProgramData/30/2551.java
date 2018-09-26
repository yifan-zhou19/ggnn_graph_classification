package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int a;
		int i;
		a = 0;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (i < n)
		{
			i++;

			if ((i % 7 == 0) || (i / 10 == 7) || (i - (i / 10) * 10 == 7))
			{
			continue;
			}
				a += i * i;

		}


		System.out.printf("%d",a);
		return 0;
	}
}

