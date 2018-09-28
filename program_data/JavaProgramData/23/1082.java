package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
		char ch;
		int n = 0;
		int i;
		for (i = 0; ; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			n++;
			if ((ch = System.in.read()) == '\n')
			{
				break;
			}
		}
		for (i = n - 1; i >= 0; i--)
		{
			System.out.printf("%s", str[i]);
			if (i > 0)
			{
				System.out.print(" ");
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

