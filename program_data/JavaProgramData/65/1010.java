package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int aw = 0;
		int bw = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			if (a == 0 && b == 1)
			{
				aw++;
			}
			if (a == 1 && b == 2)
			{
				aw++;
			}
			if (a == 2 && b == 0)
			{
				aw++;
			}
			if (a == 1 && b == 0)
			{
				bw++;
			}
			if (a == 2 && b == 1)
			{
				bw++;
			}
			if (a == 0 && b == 2)
			{
				bw++;
			}
		}
		if (aw > bw)
		{
			System.out.print("A");
		}
		else if (aw < bw)
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

