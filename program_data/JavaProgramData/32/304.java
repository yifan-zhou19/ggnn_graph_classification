package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str1 = new char[60][100];
		char[][] str2 = new char[60][100];
		String b = new String(new char[100]);
		int i;
		int k;
		int c;
		int n;
		int j;
		int t;
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
			System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			t = String.valueOf(str2[i]).length();
			c = String.valueOf(str1[i]).length();
			k = c - t;
			for (j = t - 1;j >= 0;j--)
			{
				if (str1[i][k + j] >= str2[i][j])
				{
					b = tangible.StringFunctions.changeCharacter(b, k + j, str1[i][k + j] - str2[i][j]);
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, k + j, str1[i][k + j] + 10 - str2[i][j]);
					str1[i][k + j - 1] -= 1;
				}
			}
			for (j = 0;j < k;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, str1[i][j] - 48);
			}
			for (j = 0;j < c;j++)
			{
				System.out.printf("%d",b.charAt(j));
			}
			System.out.print("\n");
		}
	}





}

