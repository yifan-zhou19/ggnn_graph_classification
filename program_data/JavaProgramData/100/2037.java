package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[26];
		int[] h = new int[26];
		int k = 0;
		String z = new String(new char[300]);
		for (i = 0;i < 26;i++)
		{
			m[i] = 0;
			h[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = tempVar.charAt(0);
		}
		n = z.length();
		for (i = 0;i < n;i++)
		{
			if ('A' <= z.charAt(i) && 'Z' >= z.charAt(i))
			{
				m[z.charAt(i) - 'A']++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ('a' <= z.charAt(i) && 'z' >= z.charAt(i))
			{
				h[z.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (m[i] != 0)
			{
					System.out.printf("%c=%d\n",'A' + i,m[i]);
			k = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (h[i] != 0)
			{
					System.out.printf("%c=%d\n",'a' + i,h[i]);
			k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}








}

