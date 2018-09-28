package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] time = new int[2][3];
		  int i;
		  int j;
		  int temp;
		  int flag = 0;
		  while (true)
		  {
			  for (i = 0; i < 2; i++)
			  {
					for (j = 0; j < 3; j++)
					{
							  time[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							if (time[i][j] != 0)
							{
								flag = 1;
							}
					}
			  }
			 if (flag == 0)
			 {
				 break;
			 }
			 else
			 {
					  temp = time[1][2] + time[1][1] * 60 + (time[1][0] + 12) * 3600 - time[0][2] - time[0][1] * 60 - time[0][0] * 3600;
					  flag = 0;
					  System.out.print(temp);
					  System.out.print("\n");
					  temp = 0;
			 }
		  }
		  return 0;
	}
}

