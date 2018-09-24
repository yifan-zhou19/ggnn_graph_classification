package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int len1;
		int len2;
		int[] t = new int[101]; //????
		char[][] s1 = new char[30][101];
		char[][] s2 = new char[30][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2[i] = tempVar3.charAt(0);
			}
			System.out.print("\n");
		} //??????

		for (i = 1;i <= n;i++)
		{
			len1 = String.valueOf(s1[i]).length();
			len2 = String.valueOf(s2[i]).length();
				for (j = 0;j <= len2 - 1;j++)
				{
					if (s1[i][len1 - j - 1] < s2[i][len2 - j - 1]) //??????
					{
						s1[i][len1 - j - 2] = s1[i][len1 - j - 2] - '1' + 48; //s1??????
						t[j] = s1[i][len1 - j - 1] - s2[i][len2 - j - 1] + 10;
					}
					else
					{
						t[j] = s1[i][len1 - j - 1] - s2[i][len2 - j - 1];
					}
				}
				for (j = len2;j <= len1 - 1;j++)
				{
					t[j] = s1[i][len1 - j - 1] - 48;
				}
			for (j = (len1 - 1);j >= 0;j--) //???????
			{
				System.out.printf("%d",t[j]);
			}
			System.out.print("\n");
		}
	}




}

