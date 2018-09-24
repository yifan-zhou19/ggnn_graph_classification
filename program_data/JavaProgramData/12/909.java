package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_jcount = new int[20];
int[] group = new int[20];
	public static int Main(String[] args)
	{
		int i;
		int j;
		int k;
		int nowi;
		int output;
		int[][] part = new int[20][16];
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int jcount[20], group[20];
		for (i = 0; i < 20; i++)
		{
			for (j = 0; j < 16; j++)
			{
			   part[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   Main_jcount[i]++;
			   if (part[i][j] <= 0)
			   {
			   break;
			   }
			}
			if (part[i][j] == -1)
			{
			   break;
			}
		}
		nowi = i;
		for (i = 0; i < nowi; i++)
		{
		   for (j = 0;j < Main_jcount[i] - 1; j++)
		   {
			  for (k = 0; k < Main_jcount[i] - 1; k++)
			  {
				 if ((part[i][j] / part[i][k] == 2) && (part[i][j] % part[i][k] == 0))
				 {
				 group[i]++;
				 }
			  }
		   }
		}

		for (output = 0; output < nowi; output++)
		{
		System.out.print(group[output]);
		System.out.print("\n");
		}



		return EXIT_SUCCESS;
	}
}

