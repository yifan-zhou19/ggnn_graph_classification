package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int l1;
		int t;
		int[] c = new int[1000];
		int[] d = new int[1000];
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l = a.length();
		l1 = b.length();
		if (l == l1)

		{
			for (i = 0;i < l;i++)
			{
			c[i] = 0;
			d[i] = 0;
			}
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l;j++)
			{
		if (a.charAt(i) == b.charAt(j) && d[j] == 0)
		{
		d[j] = 1;
		c[i] = 1;
		break;
		}
			}
		}

		t = 0;
		for (i = 0;i < l;i++)
		{
		if (c[i] == 0)
		{
			t = 1;
			break;
		}
		}
		if (t == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		}
		if (l != l1)
		{
			System.out.print("NO");
		}
	}

}

