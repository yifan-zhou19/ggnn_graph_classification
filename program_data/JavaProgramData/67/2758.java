package <missing>;

public class GlobalMembers
{
	public static float[][] ample = new float[N][2];
	public static float[] effect = new float[N];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float ample0 = 0F;
		float ample1 = 0F;
		float effect0 = 0F;
		ample0 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		ample1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		effect0 = ample1 / ample0;
		for (int i = 0; i < n - 1; i++)
		{
			ample[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			ample[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			effect[i] = ample[i][1] / ample[i][0];
			if (effect0 - effect[i] > 0.05F)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (effect[i] - effect0 > 0.05F)
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

