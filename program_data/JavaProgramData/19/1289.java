package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		s = new Scanner(System.in).nextLine();
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
		int n = s.length();
		int na = a.length();
		int i;
		int j;
		int[] ans = new int[30];
		int c = 0;
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ' || i == 0)
			{
				int count = 0;
				int q;
				if (i == 0)
				{
					q = 0;
				}
				else
				{
					q = i + 1;
				}
				for (j = q;j <= q + na - 1;j++)
				{
					if (s.charAt(j) != a.charAt(j - q))
					{
						break;
					}
					count++;
				}
				if (count == na)
				{
					ans[c] = q;
					c++;
				}
			}
		}

		if (c == 0)
		{
			System.out.printf("%s",s);
		}
		else
		{
			int p = 0;
			for (i = 0;i <= c - 1;i++)
			{
				for (j = p;j < ans[i];j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%s",b);
				p = ans[i] + na;
			}
			for (j = p;j < n;j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
		}
	}

}

