package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int k = 0;
		String s = new String(new char[8]);
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
			if (a == 0)
			{
				if (b == 1)
				{
					k++;
				}
				if (b == 2)
				{
					k--;
				}
			}
			if (a == 1)
			{
				if (b == 0)
				{
					k--;
				}
				if (b == 2)
				{
					k++;
				}
			}
			if (a == 2)
			{
				if (b == 0)
				{
					k++;
				}
				if (b == 1)
				{
					k--;
				}
			}
		}
		if (k > 0)
		{
			System.out.print("A");
		}
		else if (k == 0)
		{
			System.out.print("Tie");
		}
		else if (k < 0)
		{
			System.out.print("B");
		}
		return 0;
	}
}

