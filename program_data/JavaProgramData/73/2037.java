package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] out = new int[5][5]; //???????
		int judge = 0; //judge?????????,jusum??????????
		int jusum = 0;
		int max = 0; //max??????mplace????????
		int mplace = 0;
		int i; //i,j?????
		int j;
		int k;
		for (i = 0;i < 5;i++) //????out
		{
			for (j = 0;j < 5;j++)
			{
				out[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++) //???
		{
			max = out[i][0];
			mplace = 0;
			for (j = 1;j < 5;j++)
			{
				if (max < out[i][j])
				{
					max = out[i][j];
					mplace = j;
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (out[j][mplace] < max)
				{
					judge = 1;
				}
			}
			if (judge == 0)
			{
				i++;
				mplace++;
				System.out.print(i);
				System.out.print(' ');
				System.out.print(mplace);
				System.out.print(' ');
				i--;
				mplace--;
				System.out.print(out[i][mplace]);
				jusum = 1;
			}
			judge = 0;
		}
		if (jusum == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

