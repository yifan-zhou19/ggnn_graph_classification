package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] w = new char[50][15];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (w[i][String.valueOf(w[i]).length() - 3] == 'i')
			{
				for (j = 0;j < (int)String.valueOf(w[i]).length() - 3;j++)
				{
					System.out.printf("%c",w[i][j]);
				}
				System.out.print("\n");
			}
			 else
			 {
				 for (j = 0;j < (int)String.valueOf(w[i]).length() - 2;j++)
				 {
					System.out.printf("%c",w[i][j]);
				 }
				 System.out.print("\n");
			 }
		}

	}
}

