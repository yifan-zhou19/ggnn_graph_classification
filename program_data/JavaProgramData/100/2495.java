package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int[] a = new int[26];
		int[] b = new int[26];
		int i;
		int flag = 0;
		for (i = 0;i < s.length();i++)

		{
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				{
					a[s.charAt(i) - 'a']++;
					flag = 1;
				}
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					b[s.charAt(i) - 'A']++;
					flag = 1;
				}
		}
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

			if (flag == 0)
			{
				System.out.print("No");
			}

		return 0;
	}



}

