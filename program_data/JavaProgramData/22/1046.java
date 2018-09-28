package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int max = 0;
		int maxi = 0;
		int p = 0;
		int q = 0;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = System.in.read();
		while (b == ',')
		{
			p++;
			if (a > max)
			{
				maxi = max;
				max = a;
			}
			else if (a == max)
			{
				q++;
			}
			else if (a > maxi)
			{
				maxi = a;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			b = System.in.read();
		}
		p++;
		if (a > max)
		{
			maxi = max;
			max = a;
		}
		else if (a == max)
		{
			q++;
		}
		else if (a > maxi)
		{
			maxi = a;
		}

		if (p == 1)
		{
			System.out.print("No");
		}
		else if (p == (q + 1))
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",maxi);
		}
		return 0;
	}


}

