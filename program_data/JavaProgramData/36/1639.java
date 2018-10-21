package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int length;
		int a;
		int[] x = new int[300];
		int[] y = new int[300];
		int i;
		int j;
		String p = new String(new char[300]);
		String q = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		length = p.length();
		a = q.length();
		if (a != length)
		{
			System.out.print("NO");
			return 0;
		}
		for (i = 0;i < length;i++)
		{
			for (j = 0;j < length;j++)
			{
				if (p.charAt(i) == q.charAt(j) && y[j] == 0)
				{
					y[j] = 1;
					x[i] = 1;
					break;
				}
			}
			if (x[i] == 0)
			{
				System.out.print("NO");
				break;
			}
		}
		int c = 0;
		for (i = 0;i < length;i++)
		{
			if (x[i] == 0)
			{
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("YES");
		}
		return 0;
	}


}

