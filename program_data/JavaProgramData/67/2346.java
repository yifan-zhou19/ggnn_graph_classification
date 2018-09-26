package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n; //????
		int i;
		int j;
		double[][] a = new double[100][3]; //?2???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < 2;j++)
						{
										a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						}
		} //???????????
		for (i = 0;i < n;i++)
		{
						a[i][2] = (a[i][1] / a[i][0]);
		} //?????
		for (i = 1;i < n;i++)
		{
						if ((a[i][2] - a[0][2]) > 0.05)
						{
							System.out.print("better");
							System.out.print("\n");
						}
						if ((a[i][2] - a[0][2]) < -0.05)
						{
							System.out.print("worse");
							System.out.print("\n");
						}
						if (((a[i][2] - a[0][2]) <= 0.05) && ((a[i][2] - a[0][2]) >= -0.05))
						{
							System.out.print("same");
							System.out.print("\n");
						}
		} //???????
		return 0;
	}

}

