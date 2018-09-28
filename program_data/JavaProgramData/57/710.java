package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		char[][] string = new char[100][100];
		int i;
		int[] n = new int[100];
		for (i = 1;i <= x;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 string[i] = tempVar2.charAt(0);
						 }
						 n[i] = String.valueOf(String[i]).length();
		}
		for (i = 1;i <= x;i++)
		{
						 if (String[i][n[i] - 1] == 'r' || string[i][n[i] - 1] == 'y')
						 {
							String[i][n[i] - 2] = '\0';
						 }
						 else
						 {
							 String[i][n[i] - 3] = '\0';
						 }
						 System.out.printf("%s\n", string[i]);
		}
		return 0;
	}

}

