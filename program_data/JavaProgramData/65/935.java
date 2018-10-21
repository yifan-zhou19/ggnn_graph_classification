package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int n;
		int i;
		int[] ga = new int[200];
		int[] gb = new int[200];
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
				ga[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				gb[i] = Integer.parseInt(tempVar3);
			}
			if (ga[i] == 0 && gb[i] == 1)
			{
				a += 1;
			}
			else if (ga[i] == 0 && gb[i] == 2)
			{
				b += 1;
			}
			else if (ga[i] == 1 && gb[i] == 0)
			{
				b += 1;
			}
			else if (ga[i] == 1 && gb[i] == 2)
			{
				a += 1;
			}
			else if (ga[i] == 2 && gb[i] == 0)
			{
				a += 1;
			}
			else if (ga[i] == 2 && gb[i] == 1)
			{
				b += 1;
			}
			else if (ga[i] == gb[i])
			{
				continue;
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}

}

