package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float[] standard = new float[2];
		float std;
		float[][] a = new float[100][2];
		float other;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		standard[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		standard[1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		std = standard[1] / standard[0];
		for (int i = 0;i < n - 1;i++)
		{
			a[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			other = a[i][1] / a[i][0];
			if (other - std > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (std - other > 0.05F)
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
		return 0;
	}
}

