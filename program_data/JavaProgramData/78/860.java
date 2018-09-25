package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] w = new int[4]; //w?????????????0123??n?????????i?????
	 int i;
	 int[] n = new int[5];
	 char[] name = {'z', 'q', 's', 'l'};
	 for (w[0] = 0;w[0] <= 4;w[0]++)
	 {
	  for (w[1] = 0;w[1] <= 4;w[1]++)
	  {
		if (w[0] == w[1])
		{
		 continue;
		}
		for (w[2] = 0;w[2] <= 4;w[2]++)
		{
		  if (w[2] == w[0] || w[2] == w[1])
		  {
		   continue;
		  }
		  for (w[3] = 0;w[3] <= 4;w[3]++)
		  {
			if (w[3] == w[0] || w[3] == w[1] || w[3] == w[2])
			{
			 continue;
			}
			for (i = 0;i <= 4;i++)
			{
			 n[i] = 4;
			}
			for (i = 0;i < 4;i++)
			{
			 n[w[i]] = i;
			}
			if (w[0] + w[1] == w[2] + w[3] && w[0] + w[3] > w[1] + w[2] && w[0] + w[2] + 1 < w[1])
			{
			 for (i = 4;i >= 0;i--)
			 {
			  if (n[i] < 4)
			  {
			   System.out.print(name[n[i]]);
			   System.out.print(" ");
			   System.out.print((i + 1) * 10);
			   System.out.print("\n");
			  }
			 }
			}
		  }
		}
	  }
	 }
	 return 0;
	}
}
