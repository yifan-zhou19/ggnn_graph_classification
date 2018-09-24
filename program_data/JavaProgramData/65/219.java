package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			t = a - b;
			if (t == -1 || t == 2)
			{
				c = c + 1;
			}
			else if (t != 0)
			{
				d = d + 1;
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		else if (c < d)
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

