package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		String a = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		m = a.length();
		for (i = m;i >= 0;i--)
		{
			if (a.charAt(i) == '\0')
			{
				continue;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}

}

