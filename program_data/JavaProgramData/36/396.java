package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t = 0;
		int m;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = b.substring(0, j);
						break;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (b.charAt(i) != 0)
				{
					t = 1;
					break;
				}
			}
				if (t == 0)
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
	}


}

