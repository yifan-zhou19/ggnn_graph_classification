package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String ch1 = new String(new char[252]);
	   String ch2 = new String(new char[252]);
	   String cha1 = new String(new char[253]);
	   String cha2 = new String(new char[253]);
	   String cha3 = new String(new char[253]);
	   int i;
	   int j;
	   int len1;
	   int len2;
	   int jin;
	   ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   len1 = ch1.length();
	   len2 = ch2.length();
	   for (i = 0;i < 253;i++)
	   {
		   cha1 = tangible.StringFunctions.changeCharacter(cha1, i, '0');
		   cha2 = tangible.StringFunctions.changeCharacter(cha2, i, '0');
		   cha3 = tangible.StringFunctions.changeCharacter(cha3, i, '0');
	   }
	   for (i = 0;i < len1;i++)
	   {
		   cha1 = tangible.StringFunctions.changeCharacter(cha1, i, ch1.charAt(len1 - 1 - i));

	   }
		System.out.print("\n");
	   for (i = 0;i < len2;i++)
	   {
		   cha2 = tangible.StringFunctions.changeCharacter(cha2, i, ch2.charAt(len2 - 1 - i));

	   }
		System.out.print("\n");
		jin = 0;
		for (i = 0;i < 253;i++)
		{
		   if ((cha1.charAt(i) - '0') + (cha2.charAt(i) - '0') + jin >= 10)
		   {
			   cha3 = tangible.StringFunctions.changeCharacter(cha3, i, '0' + (cha1.charAt(i) - '0') + (cha2.charAt(i) - '0') + jin - 10);
			   jin = 1;
		   }
		   else
		   {
			   cha3 = tangible.StringFunctions.changeCharacter(cha3, i, '0' + (cha1.charAt(i) - '0') + (cha2.charAt(i) - '0') + jin);
			   jin = 0;
		   }
		}
		for (i = 252;i >= 0;i--)
		{
			if (cha3.charAt(i) != '0')
			{
				break;
			}
		}
	if (i == -1)
	{
		System.out.print('0');
	}
	else
	{
		for (j = i;j >= 0;j--)
		{
		System.out.print(cha3.charAt(j));
		}
	}

		return 0;
	}


}

