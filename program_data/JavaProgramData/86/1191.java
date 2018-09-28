package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] aa = new int[n + 100][60];
		int[] bb = new int[n + 100];
		for (i = 1;i <= n;i++)
		{
		 aa[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (aa[i][0] == 0)
		 {
		   bb[i] = 60;
		 }
		   else
		   {
		  for (j = 1;j <= aa[i][0];j++)
		  {
			 aa[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
			 j--;
			 if (aa[i][j] + 3 * j < 60)
			 {
			 bb[i] = 60 - j * 3;
			 }
			 else
			 {
					 for (j = 1;j <= aa[i][0];j++)
					 {
					 if (aa[i][j] + 3 * j > 63)
					 {
						 bb[i] = 63 - j * 3;
						 break;
					 }
					  if (aa[i][j] + 3 * j >= 60 && aa[i][j] + 3 * j <= 63)
					  {
						   bb[i] = aa[i][j];
						break;
					  }
					 }
			 }
		   }
		}
			 for (i = 1;i <= n;i++)
			 {
			 System.out.print(bb[i]);
			 System.out.print("\n");
			 }
				 return 0;
	}

}

