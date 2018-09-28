package <missing>;

public class GlobalMembers
{
	public static int compare(String s1, String s2)
	{
		int i;
		for (i = 0;i < (int)s1.length();i++)
		{
			if (!s1[i].equals(s2[i]))
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;i <= s2.length() - s1.length();i++)
		{
			if (compare(s1, s2.charAt(i)) == 1)
			{
				System.out.printf("%d",i);
				return;
			}
		}
	}
}

