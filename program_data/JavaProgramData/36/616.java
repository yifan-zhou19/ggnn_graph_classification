package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
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
		int aa;
		int bb;
		int i;
		int j;
		int t;
		int p;
		int q;
		int x;
		int[] m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		x = 0;
		aa = a.length();
		bb = b.length();
		if (aa == bb)
		{
			for (i = 0;i < aa;i++)
			{
				t = 0;
				for (j = 0;j < aa;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						t++;
					}
					if (a.charAt(j) == a.charAt(i))
					{
						p = a.charAt(j) - 65;
						m[p]++;
					}
					if (b.charAt(i) == b.charAt(j))
					{
						q = b.charAt(i) - 65;
						m[q]--;
					}
				}
				if (t == 0)
				{
					break;
				}
			}
			for (i = 0;i < 58;i++)
			{
				if (m[i] != 0)
				{
					x++;
				}
			}
			if ((t != 0) && (x == 0))
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
	}

}

