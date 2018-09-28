package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int count1 = 1;
		int count2 = 0;
		char thechar;
		String str = new String(new char[100001]);
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str,0,(Character.SIZE / Byte.SIZE));
			count1 = 1,count2 = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			//cout<<str<<' '<<endl;
			for (i = 0;i < str.length();i++)
			{
				 if (str.charAt(i) != '*')
				 {
					 thechar = str.charAt(i);
				 //cout<<thechar<<endl;
				 for (j = i + 1;j < str.length();j++)
				 {
					 if (str.charAt(j) == thechar)
					 {
						 count1++;
						 str = tangible.StringFunctions.changeCharacter(str, j, '*');
					 }
				 }

				 if (count1 == 1)
				 {
					 count2++;
					 System.out.print(thechar);
					 System.out.print("\n");
					 break;
				 }
				 }
				 count1 = 1;
			}
			if (count2 == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}

		}

	}

}

