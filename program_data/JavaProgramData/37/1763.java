package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int j;
			int k;
			int m = 0;
			String s = new String(new char[500]);
			char[] eng = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			s = new Scanner(System.in).nextLine();
			for (k = 0;s.charAt(k) != '\0';k++)
			{
				eng[s.charAt(k) - 'a']++;
			}
			for (k = 0;s.charAt(k) != '\0';k++)
			{
				if (eng[s.charAt(k) - 'a'] == 1)
				{
				System.out.printf("%c\n",s.charAt(k));
				m = 1;
				break;
				}
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

