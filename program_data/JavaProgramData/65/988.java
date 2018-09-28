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
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int t = 0;
		int h = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == b[i])
			{
			t = t + 0;
			h = h + 0;
			continue;
			}
			if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				t++;
				continue;
			}
			else
			{
				h++;
				continue;
			}
		}
		if (t > h)
		{
			System.out.print("A");
		}
		if (t < h)
		{
			System.out.print("B");
		}
		if (t == h)
		{
			System.out.print("Tie");
		}

		return 0;
	}
}

