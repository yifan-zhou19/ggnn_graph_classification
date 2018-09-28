package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][200];
		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int upm;
		int downm;
		int right;
		int left;
		upm = 1;
		downm = row;
		right = col;
		left = 1;
		int time = 0;
		while (true)
		{
		  for (j = left;j <= right;j++)
		  {
			System.out.print(a[upm][j]);
			if (time < row * col - 1)
			{
				System.out.print("\n");
			}
			time = time+1;

		  }
		  if (time == row * col)
		  {
			break;
		  }

		  for (i = upm + 1;i <= downm;i++)
		  {
			System.out.print(a[i][right]);
			if (time < row * col - 1)
			{
				System.out.print("\n");
			}
			time = time+1;
		  }
		  if (time == row * col)
		  {
			break;
		  }

		  for (j = right - 1;j >= left;j--)
		  {
			  System.out.print(a[downm][j]);
			  if (time < row * col - 1)
			  {
				System.out.print("\n");
			  }
			  time = time+1;

		  }
		  if (time == row * col)
		  {
			break;
		  }


			  for (i = downm - 1;i > upm;i--)
			  {
			   System.out.print(a[i][left]);
			   if (time < row * col - 1)
			   {
				System.out.print("\n");
			   }
			   time = time+1;
			  }

	   if (time == row * col)
	   {
			break;
	   }




		  upm = upm + 1;
		  downm = downm - 1;
		  right = right - 1;
		  left = left + 1;
		}






		return 0;
	}

}

