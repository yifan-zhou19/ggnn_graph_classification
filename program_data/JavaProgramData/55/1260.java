package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int len = 0;
	public static String str = new String(new char[101]);
	public static int[] num = new int[101];
	public static int[] res = new int[101];
	public static int pow(int x, int y)
	{
		int i;
	  int res = 1;
		for (i = 0;i < y;++i)
		{
			res *= x;
		}
	return res;
	}
	public static int Main()
	{
		 int i;
		 int j = 0;
			int con = 0;
			  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 while (str.charAt(len) != null)
				 {
				 len++;
				 }
				  for (i = 0;i < len;++i)
				  {
								if (Character.isLowerCase(str.charAt(i)))
								{
														num[i] = (int)str.charAt(i) - 87;
								}
															   if (Character.isUpperCase(str.charAt(i)))
															   {
																							 num[i] = (int)str.charAt(i) - 55;
															   }
		   if (Character.isDigit(str.charAt(i)))
		   {
								   num[i] = (int)str.charAt(i) - 48;
		   }
				  }
											   for (i = 0;i < len;++i)
											   {
															  con += num[i] * pow(a, (len - i - 1));
											   } while (con > 0)
											   {
																			 res[j] = con % b;
																					 con -= con % b;
																							  con /= b;
																									j++;
																								 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
																									  memset(str,0,(Character.SIZE / Byte.SIZE));
																										 for (i = 0;i < j;++i)
																										 {
																																if (res[i] < 10)
																																{
																																	str = tangible.StringFunctions.changeCharacter(str, j - i - 1, (char)res[i] + 48);
																																}
																																		 if (res[i] >= 10)
																																		 {
																																			 str = tangible.StringFunctions.changeCharacter(str, j - i - 1, (char)res[i] + 55);
																																		 }
																										 }
																																			 if (str.charAt(0) == 0)
																																			 {
																																				 str = tangible.StringFunctions.changeCharacter(str, 0, '0');
																																			 }
																																				System.out.print(str);
																																				System.out.print("\n");
																																				  return 0;
	}


}

