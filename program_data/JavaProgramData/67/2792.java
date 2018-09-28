package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] s = new float[100];
		float d;
		float a;
		float b;
		for (int i = 0;i < n;i++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			s[i] = b / a;
			if (i > 0)
			{
				d = s[i] - s[0];
				if (d < -0.05F)
				{
					System.out.print("worse");
				}
				else if (d > 0.05F)
				{
					System.out.print("better");
				}
				else
				{
					System.out.print("same");
				}
				System.out.print("\n");
			}
		}
	}
}

