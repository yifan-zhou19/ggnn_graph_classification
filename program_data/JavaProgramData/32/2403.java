package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		int c;
		if (a > b)
		{
			c = a;
		}
		else
		{
			c = b;
		}
		return (c);
	}

	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char temp;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int k;
		int n;
		int l;
		int flag;
		int x;
		int y;
		flag = 0;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < 100;i++)
		{
			c[i] = '0';
			str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
		}





		for (l = 0;l < n;l++)
		{
			for (i = 0;i < 100;i++)
			{
				c[i] = '0';
				str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
				str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
			}

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
			x = str1.length();
			y = str2.length();
			k = max(x, y);
			str1 = tangible.StringFunctions.changeCharacter(str1, x, '0');
			str2 = tangible.StringFunctions.changeCharacter(str2, y, '0');


			for (i = 0;i <= (x - 1) / 2;i++)
			{
				c[0] = str1.charAt(i);
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(x - 1 - i));
				str1 = tangible.StringFunctions.changeCharacter(str1, x - 1 - i, c[0]);
			}


			for (i = 0;i <= (y - 1) / 2;i++)
			{
				temp = str2.charAt(i);
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(y - 1 - i));
				str2 = tangible.StringFunctions.changeCharacter(str2, y - 1 - i, temp);
			}

			for (i = 0;i < k;i++)
			{
				if (flag == 1)
				{
					str1.charAt(i) -= 1;
					flag = 0;
				}
				if (str1.charAt(i) < str2.charAt(i))
				{
					c[i] = 10 + (str1.charAt(i) - '0') - (str2.charAt(i) - '0') + '0';
					flag = 1;
				}
				else if (str1.charAt(i) >= str2.charAt(i))
				{
					c[i] = (str1.charAt(i) - '0') - (str2.charAt(i) - '0') + '0';
				}
			}

			if (c[k - 1] == '0')
			{
				for (i = 0;i <= (k - 2) / 2;i++)
				{
					temp = c[i];
					c[i] = c[k - 2 - i];
					c[k - 2 - i] = temp;
				}
				for (i = 0;i < k - 1;i++)
				{
					System.out.printf("%c",c[i]);
				}
				System.out.print("\n");
			}

			if (c[k - 1] != '0')
			{
				for (i = 0;i <= (k - 1) / 2;i++)
				{
					temp = c[i];
					c[i] = c[k - 1 - i];
					c[k - 1 - i] = temp;
				}

				for (i = 0;i < k;i++)
				{
					System.out.printf("%c",c[i]);
				}
				System.out.print("\n");
			}
		}
	}
}

