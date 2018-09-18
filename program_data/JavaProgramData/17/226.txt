package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int l;
		int i;
		int j;
		int num1;
		int num2;
		while (gets(a))
		{
			num1 = 0;
			num2 = 0;
			l = a.length();
			for (i = 0; i < l; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < l; i++)
			{
			   if (a.charAt(i) != '(' && a.charAt(i) != ')')
			   {
				   a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			   }
			}
			for (i = 0; i < l; i++)
			{
				if (a.charAt(i) == '(')
				{
					num1++;
				}
				if (a.charAt(i) == ')')
				{
					num2++;
					if (num2 <= num1)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						for (j = i; j >= 0; j--)
						{
							if (a.charAt(j) == '(')
							{
								a = tangible.StringFunctions.changeCharacter(a, j, ' ');
								break;
							}
						}
					}
					if (num2 > num1)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
						num2--;
					}
				}
			}
			for (i = 0; i < l; i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
			}
			 for (i = 0; i < l; i++)
			 {
				System.out.print(a.charAt(i));
			 }
			System.out.print("\n");
		}
		return 0;
	}
}

