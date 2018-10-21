package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 0;
		int j = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (m / 2);i = i + 2)
		{
			c = 0;
			d = 0;
			for (a = 2;a < i;a++)
			{

				b = i % a;
				if (b == 0)
				{
				c++;
				}

			}
			for (a = 2;a < (m - i);a++)
			{

				b = (m - i) % a;
				if (b == 0)
				{
				d++;
				}

			}
			if ((c == 0) && (d == 0))
			{
				System.out.printf("%d %d\n",i,(m - i));
			}



		}
		return 0;
	}
}

