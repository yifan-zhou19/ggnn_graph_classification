package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
		char c;
		int n;
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
		for (;i > 0;i--)
		{
			System.out.printf("%s ",str[i]);
		}
		System.out.printf("%s",str[0]);
	}
}

