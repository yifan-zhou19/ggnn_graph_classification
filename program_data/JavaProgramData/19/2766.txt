package <missing>;

public class GlobalMembers
{
	public static char[][] chStr = new char[103][101];
	public static int iLen = 0;
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		while ((chStr[j] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			j++;
		}
			while (chStr[j - 1][iLen] != null)
			{
				iLen++;
			}
				for (i = 0;i < j - 2;++i)
				{
								if (!strcmp(chStr[i],chStr[j - 2]))
								{
																for (k = 0;k < 101;++k)
																{
																	chStr[i][k] = 0;
																}


								 for (k = 0;k < iLen;++k)
								 {
									 chStr[i][k] = chStr[j - 1][k];
								 }
								}
				}
												 for (i = 0;i < j - 3;++i)
												 {
																 System.out.print(chStr[i]);
																 System.out.print(" ");
												 }
																	   System.out.print(chStr[j - 3]);
																	   System.out.print("\n");
																		  return 0;
	}

}

