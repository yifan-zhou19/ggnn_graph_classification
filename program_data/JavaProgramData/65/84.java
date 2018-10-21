package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s = 0;
		int f = 0;
		int p = 0;
		int a;
		int b;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a - b == -1 || a - b == 2)
			{
				s++;
			}
			if (a - b == 0)
			{
				p++;
			}
			if (a - b == 1 || a - b == -2)
			{
				f++;
			}
		}
		if (s == f)
		{
			System.out.print("Tie");
		}
		if (s > f)
		{
			System.out.print("A");
		}
		if (s < f)
		{
			System.out.print("B");
		}
		return 0;
	}



}

