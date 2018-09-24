package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		n = s1.length();
		m = s2.length();
		if (n != m)
		{
			System.out.print("NO");
		}
		else
		{
			int i;
			int j;
			int q = 0;
			for (i = 0;i < n;i++)
			{
				int k = 0;
				int p = 0;
				for (j = 0;j < n;j++)
				{
					if (s1.charAt(j) == s1.charAt(i))
					{
						k = k + 1;
					}
				}
				for (j = 0;j < n;j++)
				{
					if (s2.charAt(j) == s1.charAt(i))
					{
						p = p + 1;
					}
				}
				if (p != k)
				{
					q = 1;
					break;
				}
			}
			if (q == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}






}

