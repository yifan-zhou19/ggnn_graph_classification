package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int min = 100;
		char[][] s = new char[250][250];
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
		for (j = 0;j < n;j++)
		{
			if (String.valueOf(s[j]).length() == max)
			{
				System.out.printf("%s\n",s[j]);
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (String.valueOf(s[j]).length() == min)
			{
				System.out.printf("%s\n",s[j]);
				break;
			}
		}
		return 0;
	}
}

