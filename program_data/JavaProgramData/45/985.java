package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[3][51];
		int i;
		int j;
		int a = 0;
		int b = 0;
		for (i = 0;i < 2;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
		}
		for (i = 0;i < 50;i++)
		{
						  if (word[0][i] != '\0')
						  {
											a++;
						  }
											else
											{
												 break;
											}
		}
		for (i = 0;i < 50;i++)
		{
						  if (word[0][0] == word[1][i])
						  {
						  for (j = 0;j < a;j++)
						  {
										   if (word[0][j] == word[1][i + j])
										   {
																		b++;
										   }
						  }
																		if (b == a)
																		{
																				System.out.printf("%d",i);
																		}
																				else
																				{
																					 b = 0;
																				}
						  }
		}

																																		  return 0;

	}



}

