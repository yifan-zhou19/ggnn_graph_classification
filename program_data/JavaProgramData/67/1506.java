package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[][] a = new float[1000][3];
		float x;
		float y;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = a[i][0] / a[i][1];
		}
		x = a[0][1] / a[0][0];
		for (i = 1;i < n;i++)
		{
			y = a[i][1] / a[i][0];
			if ((x - y) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if ((y - x) > 0.05)
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
		return 0;
	}


}

