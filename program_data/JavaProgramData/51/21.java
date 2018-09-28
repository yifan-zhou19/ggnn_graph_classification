package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static char[][] Main_separy = new char[500][5];
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_tong = new int[500];
	public static int Main(String[] args)
	{
		String ary = new String(new char[500]);
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char separy[500][5];
		int n;
		int i;
		int j;
		int k;
		String ptr;
		int len;
		ptr = ary;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ary = new Scanner(System.in).nextLine();
		len = ary.length();
		for (i = 0; i < len + 1 - n; i++)
		{
				 for (j = 0; j < n;j++)
				 {
					   Main_separy[i][j] = ary.charAt(i + j);
				 }
		}
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int tong[500];
		int x;
		int y;
		for (k = len - n; k >= 0; k--)
		{
					for (x = k + 1 ;x < len + 1 - n ;x++)
					{
							if (strcmp(Main_separy[x], Main_separy[k]) == 0)
							{
								Main_tong[k]++;
							}
					}
		}
		int max = 0;
		int[] fitgru = new int[10];
		int fitcount = 0;
		for (y = 0; y < 10; y++)
		{
			fitgru[y] = -1;
		}
		int al;
		int be;
		for (al = 0; al < len + 1 - n; al++)
		{
				  if (Main_tong[al] != 0)
				  {
						  if (Main_tong[al] > max)
						  {
									  max = Main_tong[al];
									  fitgru[0] = al;
									  fitcount = 1;
						  }
						  else if (Main_tong[al] == max)
						  {
									  fitgru[fitcount++] = al;
						  }
				  }
		}
		if (max != 0)
		{
				System.out.print(max + 1);
				System.out.print("\n");
				for (i = 0; i < fitcount; i++)
				{
						 System.out.print(Main_separy[fitgru[i]]);
						 System.out.print("\n");
				}
		}
		else
		{
			 System.out.print("NO");
		}



		return EXIT_SUCCESS;
	}

}

