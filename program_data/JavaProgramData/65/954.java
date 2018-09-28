package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int t = 0;
		int i;
		int j;
		int a;
		int b;
		int n;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == b)
			{
				continue;
			}
			else if (a == 0)
			{
				if (b == 1)
				{
					s++;
				}
				else
				{
					t++;
				}
			}
			else if (a == 1)
			{
				if (b == 2)
				{
					s++;
				}
				else
				{
					t++;
				}
			}
			else if (a == 2)
			{
				if (b == 0)
				{
					s++;
				}
				else
				{
					t++;
				}
			}
		}
		if (s > t)
		{
			System.out.print("A");
		}
		else if (s < t)
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

