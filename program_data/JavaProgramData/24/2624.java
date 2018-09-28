package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int min;
		char[][] s = new char[200][50];
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
		max = String.valueOf(s[0]).length();
		min = String.valueOf(s[0]).length();
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(s[i]).length() > max)
			{
				max = String.valueOf(s[i]).length();
			}
			if (String.valueOf(s[i]).length() < min)
			{
				min = String.valueOf(s[i]).length();
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(s[i]).length() == max)
			{
				System.out.printf("%s\n",s[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(s[i]).length() == min)
			{
				System.out.printf("%s",s[i]);
				break;
			}
		}
		return 0;
	}
}

