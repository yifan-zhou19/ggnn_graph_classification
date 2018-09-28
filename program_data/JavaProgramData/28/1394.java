package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] len = new int[300];
		char[][] s = new char[300][100];
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
		}
		for (i = 0;i < 299;i++)
		{
			len[i] = String.valueOf(s[i]).length();
			if (strcmp(s[i + 1],"\0") > 0)
			{
				System.out.printf("%d,",len[i]);
			}
			if (strcmp(s[i + 1],"\0") == 0)
			{
				System.out.printf("%d",len[i]);
				break;
			}
		}
		return 0;
	}
}

