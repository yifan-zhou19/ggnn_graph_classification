package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[26];
	public static int Main()
	{
		String a = new String(new char[300]);

		int i;
		int n;
		int t;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				b[a.charAt(i) - 'a']++;
			}
		}
		for (t = 0;t < 26;t++)
		{
				s += b[t];
		}
		if (s == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{

			if (b[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'a',b[i]);
			}
			}
		}
		return 0;
	}
}

