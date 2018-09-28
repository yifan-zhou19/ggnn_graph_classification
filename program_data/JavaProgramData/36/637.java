package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String n = new String(new char[10000]);
		String m = new String(new char[10000]);
		int[] a = new int[30];
		int[] b = new int[30];
		int[] c = new int[30];
		int[] d = new int[30];
		int i;
		int j;
		int w;
		int q;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = tempVar2.charAt(0);
		}
		w = n.length();
		q = m.length();
		if (w == q)
		{
			for (i = 0;i < 26;i++)
			{
			for (j = 0;j < w;j++)
			{
				if (n.charAt(j) == 65 + i)
				{
					a[i] = a[i] + 1;
				}
				if (n.charAt(j) == 97 + i)
				{
					b[i] = b[i] + 1;
				}
				if (m.charAt(j) == 65 + i)
				{
					c[i] = c[i] + 1;
				}
				if (m.charAt(j) == 97 + i)
				{
					d[i] = d[i] + 1;
				}
			}
			}
		for (i = 0;i < 26;i++)
		{
			if (a[i] == c[i] && b[i] == d[i])
			{
				z = 1;
			}
			else
			{
				System.out.print("NO\n");
				z = 0;
				break;
			}
		}
		if (z == 1)
		{
			System.out.print("YES\n");
		}
		}
		if (w != q)
		{
			System.out.print("NO\n");
		}
	}
}

