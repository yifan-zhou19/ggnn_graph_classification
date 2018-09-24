package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] p = new int[2];
		int s = 0;
		int q;
		double j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = n;

		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[1] = Integer.parseInt(tempVar3);
			}
			if ((p[0] == 0 && p[1] == 1) || (p[0] == 1 && p[1] == 2) || (p[0] == 2 && p[1] == 0))
			{
			   s++;
			}
			else if (p[0] == p[1])
			{
				q--;
			}

		}
		j = (1.0 * q) / (2 * 1.0);
		if (s > j)
		{
			System.out.print("A");
		}
		else if (s < j)
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

