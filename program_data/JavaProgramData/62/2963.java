package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sen = {0};
		int i;
		int e;
		for (i = 0;i < MAX;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sen[i] = tempVar.charAt(0);
			}
		}
		System.out.printf("%s",sen[0]);
		for (i = 1;sen[i][0];i++)
		{
			System.out.printf(" %s",sen[i]);
		}
		return 0;
	}
}

