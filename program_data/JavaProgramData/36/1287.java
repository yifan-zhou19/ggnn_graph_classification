package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char temp;
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}

		a = str1.length();
		b = str2.length();

		if (a != b)
		{
			System.out.print("NO\n");
		}
		else if (a == b)
		{
			for (i = 0;i < a - 1;i++)
			{
				for (j = i + 1;j < a;j++)
				{
					if (str1.charAt(i) > str1.charAt(j))
					{
						temp = str1.charAt(i);
						str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(j));
						str1 = tangible.StringFunctions.changeCharacter(str1, j, temp);
					}
				}
			}

			for (i = 0;i < b - 1;i++)
			{
				for (j = i + 1;j < b;j++)
				{
					if (str2.charAt(i) > str2.charAt(j))
					{
						temp = str2.charAt(i);
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(j));
						str2 = tangible.StringFunctions.changeCharacter(str2, j, temp);
					}
				}
			}

			for (i = 0;i < a - 1;i++)
			{
				if (str1.charAt(i) != str2.charAt(i))
				{
					System.out.print("NO\n");
					break;
				}
			}
			if (i == a - 1)
			{
			System.out.print("YES\n");
			}
		}
	}

}

