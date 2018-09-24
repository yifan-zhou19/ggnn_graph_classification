package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		m = 1;
		String s = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		i = s.length();
		i = i - 1;
		while (i >= 0)
		{
			System.out.printf("%c",s.charAt(i));
			i = i - 1;
		}
		return 0;
	}

}

