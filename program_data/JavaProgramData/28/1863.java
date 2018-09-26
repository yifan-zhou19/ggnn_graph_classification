package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[300][100];
		int i;
		int l;
		int n;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			if (str[i][0] == '\0')
			{
				break;
			}
			l = String.valueOf(str[i]).length();
			if (i == 0)
			{
				System.out.printf("%d",l);
			}
			else
			{
				System.out.printf(",%d",l);
			}
		}

		return 0;
	}
}

