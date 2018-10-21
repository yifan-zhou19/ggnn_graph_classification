package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER NOTE: 'register' variable declarations are not supported in Java:
//ORIGINAL LINE: register int i,j,flag;
		int i;
		int j;
		int flag;
	int n;
		flag = 0;
		String str1 = new String(new char[20000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 str1 = tangible.StringFunctions.changeCharacter(str1, i - 1, tempVar2);
						 }
						 if (i >= 2)
						 {
								flag = 0;
								 for (j = 1;j <= i - 1;j++)
								 {
													if (str1.charAt(i - 1) == str1.charAt(j - 1))
													{
																		   flag = 1;
																		   break;
													}
								 }
																		   if (flag == 0)
																		   {
																					  System.out.printf(" %d",str1.charAt(i - 1));
																		   }
						 }
																					  else
																					  {
																						  System.out.printf("%d",str1.charAt(0));
																					  }
		}
																					  return 0;
	}

}

