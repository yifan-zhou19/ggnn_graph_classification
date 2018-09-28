package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char[][] substr = new char[100][100];
		int m = 0;
		int i;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr[i] = tempVar.charAt(0);
			}
			m = m + 1;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		str = substr;
		for (i = m - 1;i > 0;i--)
		{
			System.out.printf("%s ",str.charAt(i));
		}
		System.out.printf("%s",str.charAt(0));
	}
}

