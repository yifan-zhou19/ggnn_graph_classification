package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[260]);
		String sub = new String(new char[260]);
		String re = new String(new char[260]);
		int i;
		int len1;
		int len2;
		int m;
		int xxx;
		int yyy = 0;
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		len1 = s.length();
		len2 = sub.length();

		 for (i = 0;i < len1 - len2 + 1;i++)
		 {
									xxx = 0;
									for (m = 0;m < len2;m++)
									{
														 if (s.charAt(i + m) == sub.charAt(m))
														 {
																			  xxx++;
														 }
									}
									if (xxx == len2)
									{
												for (m = 0;m < len2;m++)
												{
																	s = tangible.StringFunctions.changeCharacter(s, i + m, re.charAt(m));
																	yyy++;
																	if (yyy == len2)
																	{
																		break;
																	}
												}
									if (yyy == len2)
									{
										break;
									}
									}
		 }


		 System.out.printf("%s",s);

	}

}

