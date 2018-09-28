package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????
	 *  ????: 2010-12-19
	 *    ??????
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[][] a = new float[100][2];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 2;j++)
			{
				a[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}
		float[] b = new float[100];
		for (int i = 0;i < n;i++)
		{
			b[i] = a[i][1] / a[i][0];
		}
		for (int i = 1;i < n;i++)
		{
			if (b[i] > b[0])
			{ //???
				if ((b[i] - b[0]) > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
			else
			{
				if ((b[0] - b[i]) > 0.05)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
					else
					{
						System.out.print("same");
						System.out.print("\n");
					}
			}
		}
		return 0;
	}

}

