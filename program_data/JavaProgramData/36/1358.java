package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int t;
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
		t = 0;
		for (i = 0;a.charAt(i) != 0;i++)
		{
			k = 0;
			l = 0;
			for (j = 0;a.charAt(j) != 0;j++)
			{
				if (a.charAt(j) == a.charAt(i))
				{
					k++;
				}
			}
			for (m = 0;b.charAt(m) != 0;m++)
			{
				if (b.charAt(m) == a.charAt(i))
				{
					l++;
				}
			}
			if (k != l)
			{
				t = 1;
				break;
			}
		}
		if (t == 0 && j == m)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

