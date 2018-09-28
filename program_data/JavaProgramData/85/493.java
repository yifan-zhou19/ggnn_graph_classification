package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int temp;
		char[][] word = new char[100][30];

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
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			temp = 1;
			if (word[i][0] != '_')
			{

				   if (word[i][0] > 'z' || word[i][0] < 'A' || word[i][0]>'Z' && word[i][0] < 'a')
				   {
						temp = 0;
				   }
			}
		for (j = 1;j < String.valueOf(word[i]).length();j++)
		{
				if (word[i][j] < '0' || word[i][j]>'z' || word[i][j] > '9' && word[i][j] < 'A' || (word[i][j]>'Z' && word[i][j] < 'a' && word[i][j] != '_'))
				{
					temp = 0;
				}
		}
		if (temp == 0)
		{
					System.out.print("no\n");
		}
				else
				{
					System.out.print("yes\n");
				}
		}
	}
}

