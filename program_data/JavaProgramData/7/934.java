package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[257]);
		String str2 = new String(new char[257]);
		String str3 = new String(new char[257]);

		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();

		int i;
		int j;
		int k;
		for (i = 0;i < str1.length();i++)
		{
								   j = 0;
								   k = i;
								   while (j < str2.length())
								   {
														if (str2.charAt(j) != str1.charAt(k))
														{
																			break;
														}
														else
														{
															j++;
														}
															k++;
								   }
								   if (j == str2.length())
								   {
									   System.out.printf("%s",str3);
									   break;
								   }
								   else
								   {
									   System.out.printf("%c", str1.charAt(i));
								   }
		}
		if (i != str1.length())
		{
						   for (i = k;i < str1.length();i++)
						   {
													  System.out.printf("%c", str1.charAt(i));
						   }
		}
		return 0;
	}

}
