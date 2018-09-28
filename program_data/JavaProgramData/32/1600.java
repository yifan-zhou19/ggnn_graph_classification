package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int k;
		int i;
		int n;
		int j;
		int a = 102;
		int b = 0;
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
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			k = str1.length() - str2.length();
			for (j = str1.length() - 1;j >= k;j--)
			{
				if (b != 0)
				{
					str1.charAt(j)--;
				}
				if (str1.charAt(j) >= str2.charAt(j - k))
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j) - str2.charAt(j - k) + 48);
					b = 0;
				}
				else
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j) + 10 - str2.charAt(j - k) + 48);
					b = 1;
				}
			}

			for (j = k - 1;j >= 0;j--)
			{
				if (b != 0)
				{
					str1.charAt(j)--;
				}
				if (str1.charAt(j) < '0')
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j) + 10);
					b = 1;
				}
				else
				{
					b = 0;
				}
			}

			for (j = 0;j < str1.length();j++)
			{
				if (str1.charAt(j) != '0')
				{
					a = j;
					break;
				}
			}
			for (j = a;j < str1.length();j++)
			{
					System.out.printf("%c",str1.charAt(j));
			}
			System.out.print("\n");
		}
	}
}

