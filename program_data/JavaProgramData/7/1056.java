package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int sum;
		int mm = 0;
	  String string1 = new String(new char[NUM + 10]);
	  String subString = new String(new char[NUM + 10]);
	  String replacement = new String(new char[NUM + 10]);

	for (k = 0;k < NUM + 10;k++) //?????
	{
	   string1 = tangible.StringFunctions.changeCharacter(string1, k, '0');
	   subString = tangible.StringFunctions.changeCharacter(subString, k, '0');
	   replacement = tangible.StringFunctions.changeCharacter(replacement, k, '0');
	}

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  string1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  subString = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  replacement = tempVar3.charAt(0);
	  }

	  int len1 = string1.length(); //?????
	  int len2 = subString.length();
	  int len3 = replacement.length();


	  for (i = 0;i < len1 - len2 + 1;i++)
	  {
		  sum = 0;
			  if (string1.charAt(i) == subString.charAt(0)) //??????????
			  {
				for (j = 0;j < len2;j++)
				{
					if (subString.charAt(j) == string1.charAt(i + j))
					{
				sum++;
					}
				}

				if (sum == len2) //???????
				{
				  for (k = 0;k < i;k++) //??1
				  {
				  System.out.printf("%c",string1.charAt(k));
				  }
				  for (k = 0;k < len3;k++) //??2
				  {
				  System.out.printf("%c",replacement.charAt(k));
				  }
				  for (k = i + len2;k < len1;k++) //??3
				  {
				  System.out.printf("%c",string1.charAt(k));
				  }
				}

					if (sum == len2)
					{
					break;
					}

			  }
	  }

		if (i == len1 - len2 + 1)
		{
		for (k = 0;k < len1;k++)
		{
		System.out.printf("%c",string1.charAt(k));
		}
		}


	 System.in.read();
	  System.in.read();
	   System.in.read();
		System.in.read();
		 System.in.read();
		  System.in.read();


	}

}

