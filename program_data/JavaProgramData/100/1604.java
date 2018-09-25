package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		char bian = 'A';
		int i;
		int j;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (j = 0;s.charAt(j) != '\0';j++)
		{
			if ((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z'))
			{
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		for (i = 0;i < 26;i++)
		{
			k = 0;
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if (s.charAt(j) == bian)
				{
					k++;
				}
			}
			if (k != 0)
			{
				System.out.printf("%c=%d\n", bian, k);
			}
			bian++;
		}
		bian = 'a';
		for (i = 0;i < 26;i++)
		{
			k = 0;
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if (s.charAt(j) == bian)
				{
					k++;
				}
			}
			if (k != 0)
			{
				System.out.printf("%c=%d\n", bian, k);
			}
			bian++;
		}
		return 0;
	}
}

