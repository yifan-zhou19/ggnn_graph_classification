package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] time = new int[100][100];
	   int[] num = new int[100];
	   for (int i = 0;i < n;i++)
	   {
		   num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   int j = 0;
		   for (j = 0;j < num[i];j++)
		   {
			   time[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		   while (true)
		   {

			  if ((time[i][j - 1] + 3 * num[i]) <= 60)
			  {
				  System.out.print(60 - 3 * num[i]);
				  System.out.print("\n");
				  break;
			  }
			  else if ((time[i][j - 1] + 3 * (num[i] - 1)) <= 60)
			  {
				  System.out.print(time[i][j - 1]);
				  System.out.print("\n");
				  break;
			  }
			  else
			  {
					  j--;
					  num[i]--;
			  }
		   }

	   }
	  return 0;
	}


















}

