package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int k = 0;
		int p = 0;
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
			if (a == 0 && b == 1)
			{
				k++;
			}
			else if (a == 1 && b == 2)
			{
				k++;
			}
			else if (a == 2 && b == 0)
			{
				k++;
			}
			else if (a == b)
			{
				p++;
			}
		}
		if (k > 1.0 * (n - p) / 2)
		{
			System.out.print("A");
		}
		else if (k < 1.0 * (n - p) / 2)
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

