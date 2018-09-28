package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		char[][] str = new char[50][20];
		char s;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			if (s = System.in.read() == '\n')
			{
				break;
			}

		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%s ", str[j]);
		}
		System.out.printf("%s", str[i]);
		return 0;
	}

}

