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
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		d = 0;
		e = 0;
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
			c = a - b;
			if (c == -1 || c == 2)
			{
				d++;
			}
			else
			{
				if (c != 0)
				{
				e++;
				}
			}
		}
		if (d > e)
		{
			System.out.print("A");
		}
		else
		{
			if (d < e)
			{
				System.out.print("B");
			}
			else
			{
				System.out.print("Tie");
			}
		}
		return 0;
	}

}

