package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int c;
		int d;
		a = 0;
		b = 0;
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
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (c == 0 && d == 1)
			{
				a++;
			}
			else if (c == 1 && d == 2)
			{
				a++;
			}
			else if (c == 2 && d == 0)
			{
				a++;
			}
			else if (c == 1 && d == 0)
			{
				b++;
			}
			else if (c == 2 && d == 1)
			{
				b++;
			}
			else if (c == 0 && d == 2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (b > a)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}


		return 0;
	}
}

