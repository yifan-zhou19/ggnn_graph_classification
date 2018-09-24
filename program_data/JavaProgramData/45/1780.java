package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a;
		int i;
		int j;
		int[] len = new int[2];
		int judge = 1;
		int k;
		int m = 0;
		char[][] word = new char[2][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			word[1] = tempVar2.charAt(0);
		}
		len[0] = String.valueOf(word[0]).length();
		len[1] = String.valueOf(word[1]).length();
		for (i = 0;i < (len[1] - len[0] + 1);i++)
		{
			judge = 1;
			k = i;
			for (j = 0,m = 0;j < len[0];j++,k++)
			{
				if (word[0][j] == word[1][k])
				{
					m = 1;
				}
				else
				{
					m = 0;
				}
				judge = judge != 0 && m != 0;
			}
			if (judge != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;

	}

}

