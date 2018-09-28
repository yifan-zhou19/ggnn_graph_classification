package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*    ??   1100012931                                 *
	//*    ??? ??                                       *
	//*    ???  2011.10.29                                *
	//********************************************************
	public static int Main()
	{
		int[] t = new int[4];
		int i;
		int j;
		int a;
		final String x = "zqsl";
		char b;
		for (t[0] = 1;t[0] <= 5;t[0]++)
		{
		for (t[1] = 1;t[1] <= 5;t[1]++)
		{
		for (t[2] = 1;t[2] <= 5;t[2]++)
		{
		for (t[3] = 1;t[3] <= 5;t[3]++)
		{
			if (((t[0] + t[1]) == (t[3] + t[2])) && ((t[0] + t[3]) > (t[1] + t[2])) && (t[0] + t[2] < t[1])) //????
			{
				 for (i = 0;i < 3;i++) //??????
				 {
				 for (j = i + 1;j < 4;j++)
				 {
					 if (t[i] < t[j])
					 {
					  a = t[i];
					  t[i] = t[j];
					  t[j] = a;
						 b = x.charAt(i);
						 x = tangible.StringFunctions.changeCharacter(x, i, x.charAt(j));
						 x = tangible.StringFunctions.changeCharacter(x, j, b); //????????????
					 }
				 }
				 }
				 for (i = 0;i < 4;i++)
				 {
					  System.out.print(x.charAt(i));
					  System.out.print(" ");
					  System.out.print(t[i] * 10);
					  System.out.print("\n");
				 } //???????*10??????
				 return 0;
			}
		}
		}
		}
		}
	}

}

