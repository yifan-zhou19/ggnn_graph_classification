package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		int d = 0;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		int[] a = new int[200];
		int[] b = new int[200];
		double e;
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
			if (a[i] == 0 && b[i] == 1)
			{
				c++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				c++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				c++;
			}
			else if (a[i] == b[i])
			{
				m--;
			}
		}
		e = (double)m;
		e = e / 2;
		if (c < e)
		{
			System.out.print("B");
		}
		else if (c > e)
		{
			System.out.print("A");
		}
		else if (c == e)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

