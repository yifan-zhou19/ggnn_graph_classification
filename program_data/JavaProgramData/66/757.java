package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s;
		int i;
		int t;
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}

		t = (a - 1) % 400;
		if (t != 0)
		{
			s = (t * 365);
			for (i = 1;i < t;i++)
			{
			   if (((i + 1) % 4 == 0 && (i + 1) % 100 != 0))
			   {
				s = (s + 1);
			   }
			}
			if (((((t + 1) % 4 == 0 && (t + 1) % 100 != 0)) && b > 2) != 0)
			{
				   s = s + 1;
			}
		}
		if (t == 0)
		{
			m[1] = 28;
		}
			for (i = 0;i < b - 1;i++)
			{
				s = (s + m[i]) % 7;
			}
			i = (s + c) % 7;
			if (i == 0)
			{
				System.out.print("Sun.");
			}
			if (i == 1)
			{
				System.out.print("Mon.");
			}
			if (i == 2)
			{
				System.out.print("Tue.");
			}
			if (i == 3)
			{
				System.out.print("Wed.");
			}
			if (i == 4)
			{
				System.out.print("Thu.");
			}
			if (i == 5)
			{
				System.out.print("Fri.");
			}
			if (i == 6)
			{
				System.out.print("Sat.");
			}
			return 0;
	}

}

