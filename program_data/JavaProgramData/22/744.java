package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int m;
		int n;
		n = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		if (c != ',')
		{
			System.out.print("No");
		}

		else
		{
		while (c == ',')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			if (num > m)
			{
				 n = m;
				 m = num;

			}
			else if (n < num && num < m)
			{
				n = num;
			}
		}
		if (n == 0)
		{
			System.out.print("No");
		}
		else if (m != n)
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.print("No");
		}
		}
		return 0;
	}





}

