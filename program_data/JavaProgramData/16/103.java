package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int w;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 9999)
		{
			System.out.print("00001");
		}
		else if (n > 999)
		{
			w = 4;
		}
		else if (n > 99)
		{
			w = 3;
		}
		else if (n > 9)
		{
			w = 2;
		}
		else
		{
			System.out.printf("%d",n);
		}

		for (i = 1;i < w + 1;i++)
		{
			c = n % 10;
			n = n / 10;

			System.out.printf("%d",c);
		}


	return 0;
	}

}

