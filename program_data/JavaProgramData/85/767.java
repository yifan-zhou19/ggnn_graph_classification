package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][20];
		String sample1 = new String(new char[54]);
		String sample2 = new String(new char[64]);
		int n;
		int i;
		int j;
		int k;
		int tmp1;
		int tmp2;
		int tmp3;
		int length;
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
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			sample1 = tangible.StringFunctions.changeCharacter(sample1, i, i + 65);
		}
		for (;i < 52;i++)
		{
			sample1 = tangible.StringFunctions.changeCharacter(sample1, i, i + 71);
		}
		sample1 = tangible.StringFunctions.changeCharacter(sample1, 53, 95);
		for (i = 0;i < 53;i++)
		{
			sample2 = tangible.StringFunctions.changeCharacter(sample2, i, sample1.charAt(i));
		}
		for (;i < 63;i++)
		{
			sample2 = tangible.StringFunctions.changeCharacter(sample2, i, i - 5);
		}
		sample2 = tangible.StringFunctions.changeCharacter(sample2, 63, 95);
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(str[i]).length();
			for (j = 0,tmp1 = 1;j < 54;j++)
			{
				if (str[i][0] == sample1.charAt(j))
				{
					tmp1 = 0;
					break;
				}
			}
			if (tmp1 == 1)
			{
				System.out.print("no\n");
				continue;
			}
			for (j = 1,tmp3 = 1;j < length;j++)
			{
				for (k = 0,tmp2 = 1;k < 64;k++)
				{
					if (str[i][j] == sample2.charAt(k))
					{
						tmp2 = 0;
						break;
					}
				}
				if (tmp2 == 1)
				{
					System.out.print("no\n");
					tmp3 = 0;
				}
				else
				{
					continue;
				}
				if (tmp3 == 0)
				{
					break;
				}
			}
			if (j == length)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

