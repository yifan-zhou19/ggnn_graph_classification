package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int[] a = new int[101];
		int l;
		int i;
		int j;
		int temp;
		while ((str1 = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //??????????????
		{
			l = str1.length(); //????
			for (i = 0;i < l;i++)
			{
				if (str1.charAt(i) == '(')
				{
					a[i] = 1;
				}
				else if (str1.charAt(i) == ')')
				{
					a[i] = -1;
				}
				else
				{
					a[i] = 0;
				}
			} //?????????????
			for (i = 0;i < l;i++)
			{
				if (a[i] == 1) //????????
				{
					temp = 0;
					for (j = i;j < l;j++) //????????
					{
						temp = temp + a[j];
						if (temp == 0)
						{
							a[i] = 0;
							a[j] = 0;
							break; //??????????????????0
						}
					}
				}
			}
			for (i = 0;i < l;i++) //?????????????
			{
				if (a[i] == 1)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, '$');
				}
				 else if (a[i] == -1)
				 {
					str2 = tangible.StringFunctions.changeCharacter(str2, i, '?');
				 }
				 else
				 {
					 str2 = tangible.StringFunctions.changeCharacter(str2, i, ' ');
				 }
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, l, '\0');
			System.out.print(str1);
			System.out.print("\n");
			System.out.print(str2);
			System.out.print("\n");
			System.out.print("\n");
		}
		return 0;
	}



}

