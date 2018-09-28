package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] c = new char[100][100];
		int i;
		a = c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = tempVar.charAt(0);
			}
		if (System.in.read() == '\n')
		{
			break;
		}
		}
		for (a = c + i;a != c;a--)
		{
			System.out.printf("%s ",*a);
		}
		   System.out.printf("%s",*a);
	}
}

