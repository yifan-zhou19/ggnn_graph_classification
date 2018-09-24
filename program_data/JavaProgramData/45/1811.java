package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] shuru = new char[2][50];
		int i;
		for (i = 0;i < 2;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				shuru[i] = tempVar.charAt(0);
			}
		}
		int len = String.valueOf(shuru[1]).length();
		int j;
		for (j = 0;j < len;j++)
		{
			if (shuru[0][0] == shuru[1][j])
			{
				System.out.printf("%d",j);
				break;
			}
		}
		return 0;
	}


}

