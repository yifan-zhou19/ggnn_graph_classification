package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int t1;
		int t2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = b = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t2 = Integer.parseInt(tempVar3);
			}
			if (t1 == 0)
			{
				if (t2 == 1)
				{
					a++;
				}
				else if (t2 == 2)
				{
					b++;
				}
			}
			else if (t1 == 1)
			{
				if (t2 == 0)
				{
					b++;
				}
				else if (t2 == 2)
				{
					a++;
				}
			}
			else
			{
				if (t2 == 0)
				{
					a++;
				}
				else if (t2 == 1)
				{
					b++;
				}
			}
		}
		if (a == b)
		{
			System.out.println("Tie");
		}
		else if (a > b)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("B");
		}
	}
}

