package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int a;
		int b;
		int s = 0;
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
			if (a > b)
			{
				s++;
			}
			if (a < b)
			{
				s--;
			}
			if (a == 2 && b == 0)
			{
				s = s - 2;
			}
			if (a == 0 && b == 2)
			{
				s = s + 2;
			}
		}
		if (s == 0)
		{
			System.out.print("Tie");
		}
		if (s < 0)
		{
			System.out.print("A");
		}
		if (s > 0)
		{
			System.out.print("B");
		}
		return 0;
	}
}

