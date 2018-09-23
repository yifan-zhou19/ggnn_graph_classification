package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char a;
		char b;
		String c = new String(new char[101]);
		int len;
		int i;
		int j;
		int flag;
		while (gets(s))
		{
						   c = s;
						   len = s.length();
						   for (i = 0;i < len;i++)
						   {
											 flag = 0;
											 if (s.charAt(i) == 41)
											 {
														 for (j = i - 1;j >= 0;j--)
														 {
																			if (s.charAt(j) == 40)
																			{
																						flag++;
																						break;
																			}
														 }
														 if (flag == 1)
														 {
																	s = tangible.StringFunctions.changeCharacter(s, i, 32);
																	s = tangible.StringFunctions.changeCharacter(s, j, 32);
														 }
														 else
														 {
														 s = tangible.StringFunctions.changeCharacter(s, i, '?');
														 }
											 }
						   }
						   System.out.printf("%s\n",c);
						   for (i = 0;i < len;i++)
						   {
											 if (s.charAt(i) == '?')
											 {
											 System.out.print("?");
											 }
											 else if (s.charAt(i) == 40)
											 {
											 System.out.print("$");
											 }
											 else
											 {
											 System.out.print(" ");
											 }
						   }
						   System.out.print("\n");
		}
		return 0;
	}
}

