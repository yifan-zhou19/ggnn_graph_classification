package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] l1 = new int[100];
		int[] l2 = new int[100];
		char[][] str1 = new char[100][100];
		char[][] str2 = new char[100][100];
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
				str1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l1[i] = String.valueOf(str1[i]).length();
			l2[i] = String.valueOf(str2[i]).length();
			for (j = 1;j < l2[i] + 1;j++)
			{
				if (str1[i][l1[i] - j] >= str2[i][l2[i] - j])
				{
				str1[i][l1[i] - j] = str1[i][l1[i] - j] - str2[i][l2[i] - j] + 48;
				}
				else
				{
					str1[i][l1[i] - j - 1] = str1[i][l1[i] - j - 1] - 1;
					str1[i][l1[i] - j] = str1[i][l1[i] - j] + 10 - str2[i][l2[i] - j] + 48;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str1[i]);
		}
	}

}

