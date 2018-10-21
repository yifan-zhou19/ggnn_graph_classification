package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String c = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		n = c.length();
		for (i = 0;i < n;i++)
		{
			j = n - i - 1;
			System.out.printf("%c",c.charAt(j));
		}
		return 0;
	}

}

