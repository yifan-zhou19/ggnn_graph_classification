package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int l1;
		int l2;
		int l;
		int i;
		int j;
		int[] t = new int[10000];
		int z;
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
		l1 = a.length();
		l2 = b.length();
		l = 0;
		z = 0;
		if (l1 == l2)
		{
			l = l1;
		}
		else
		{
			System.out.print("NO\n");
			z = 1;
		}
		for (i = 0;i < l;i++)
		{
			t[i] = 0;
			for (j = 0;j < l;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					t[i] = 1;
					b = b.substring(0, j);
					break;

				}
			}
				if (t[i] == 0)
				{
					z = 1;
					System.out.print("NO\n");
					break;
				}
		}
		if (z != 1)
		{
			System.out.print("YES\n");
		}
		return 0;
	}
}

