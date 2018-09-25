package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[1000][40];
		int n;
		int len = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		len = String.valueOf(s[0]).length();
		for (i = 0;i < n - 1;i++)
		{
			len = len + String.valueOf(s[i + 1]).length() + 1;
			if (len > 80)
			{
				len = String.valueOf(s[i + 1]).length();
				System.out.printf("%s",s[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.printf("%s ",s[i]);
			}
		}
		System.out.printf("%s",s[n - 1]);
	}
}

