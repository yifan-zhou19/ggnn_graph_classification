public class sha
{
	public int gaodu;
	public int x;
	public int y;
	public int shanding;
}

package <missing>;

public class GlobalMembers
{
	public static sha[][] mou = new sha[100][200];
	public static sha t = new sha();
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				mou[i][j].gaodu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				mou[i][j].x = i;
				mou[i][j].y = j;
				mou[i][j].shanding = 0;
			}
		}
		for (i = 0;i <= m + 1;i++)
		{
			mou[i][n + 1].gaodu = 0;
			mou[i][0].gaodu = 0;
		}
		for (i = 0;i <= n + 1;i++)
		{
			mou[m + 1][i].gaodu = 0;
			mou[0][i].gaodu = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (mou[i][j].gaodu >= mou[i - 1][j].gaodu != 0 && mou[i][j].gaodu >= mou[i + 1][j].gaodu != 0 && mou[i][j].gaodu >= mou[i][j - 1].gaodu != 0 && mou[i][j].gaodu >= mou[i][j + 1].gaodu)
				{
					mou[i][j].shanding = 1;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (mou[i][j].shanding == 1)
				{
					System.out.print(mou[i][j].x - 1);
					System.out.print(" ");
					System.out.print(mou[i][j].y - 1);
					System.out.print("\n");
				}
			}
		}
	return 0;
	}
}

