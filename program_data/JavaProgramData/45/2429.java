package <missing>;

public class GlobalMembers
{
	public static int check(int i, String s, String w, int m)
	{
		int n = 0;
		int j;
		for (j = 0;j < m;j++)
		{
			if (s[j].equals(w[i + j]))
			{
				n++;
			}
		}

		if (n == m)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i;
		int m;
		int n;
		int j = 0;
		m = s.length();
		n = w.length();
		for (i = 0;i < n;i++)
		{
			if (check(i, s, w, m) == 0)
			{
				break;
			}
		}

		System.out.printf("%d",i);
		return 0;
	}

}

