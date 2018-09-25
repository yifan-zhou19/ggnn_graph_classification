package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int temp;
		int lengtha;
		int lengthb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		lengtha = a.length();
		for (i = 0;i < 100;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		if (lengtha > 2)
		{
			if (10 * (a.charAt(0) - '0') + a.charAt(1) - '0' >= 13)
			{
				temp = 10 * (a.charAt(0) - '0') + a.charAt(1) - '0';
				for (i = 0;i < lengtha - 1;i++)
				{
					if (i != lengtha - 2)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, temp / 13 + '0');
						temp = 10 * (temp % 13) + a.charAt(i + 2) - '0';
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, i, temp / 13 + '0');
						temp = temp % 13;
					}
				}
			}
			else
			{
				temp = 100 * (a.charAt(0) - '0') + 10 * (a.charAt(1) - '0') + a.charAt(2) - '0';
				for (i = 0;i < lengtha - 2;i++)
				{
					if (i != lengtha - 3)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, temp / 13 + '0');
						temp = 10 * (temp % 13) + a.charAt(i + 3) - '0';
					}
					else
					{
					b = tangible.StringFunctions.changeCharacter(b, i, temp / 13 + '0');
					temp = temp % 13;
					}
				}
			}
		System.out.printf("%s\n",b);
		System.out.printf("%d",temp);
		}
		else if (lengtha == 1)
		{
		System.out.print("0\n");
		System.out.printf("%c",a.charAt(0));
		}
		else if (lengtha == 2)
		{
			if (10 * (a.charAt(0) - '0') + a.charAt(1) - '0' >= 13)
			{
				System.out.printf("%d\n",(10 * (a.charAt(0) - '0') + a.charAt(1) - '0') / 13);
				System.out.printf("%d",(10 * (a.charAt(0) - '0') + a.charAt(1) - '0') % 13);
			}
			else
			{
				System.out.print("0\n");
				System.out.printf("%d",10 * (a.charAt(0) - '0') + a.charAt(1) - '0');
			}
		}
	return 0;
	}

}

