package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		int i;
		int[] d = new int[26];
		int r;

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

		for (i = 0;i < a.length();i++)
		{
			for (c = 'a';c <= 'z';c++)
			{
				if (c == a.charAt(i))
				{
					d[c - 'a']++;
				}
			}
		}

		for (i = 0;i < b.length();i++)
		{
			for (c = 'a';c <= 'z';c++)
			{
				if (c == b.charAt(i))
				{
					d[c - 'a']--;
				}
			}
		}
		r = 0;
		for (i = 0;i < 26;i++)
		{
			if (d[i] != 0)
			{
				r = 1;
			}
		}

		if (r == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

