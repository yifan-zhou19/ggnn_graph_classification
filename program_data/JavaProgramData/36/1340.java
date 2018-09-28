package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int m;
		int n;
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
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = b.substring(0, j);
						break;
					}
				}
				if (j == n)
				{
					System.out.print("NO");
				break;
				}
			}
			if (i == a.length())
			{
				System.out.print("YES");
			}
		}

		return 0;
	}

}

