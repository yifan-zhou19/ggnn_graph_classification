package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		int[] a = new int[26];
		int[] b = new int[26];
		int i;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
			{
				f = 1;
				a[s.charAt(i) - 'a']++;
			}
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
			{
				f = 1;
				b[s.charAt(i) - 'A']++;
			}
		}
		if (f == 1)
		{
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
			System.out.printf("%c=%d\n",'A' + i,b[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
			System.out.printf("%c=%d\n",'a' + i,a[i]);
			}
		}
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}


}

