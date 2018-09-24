package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] a = new float[100];
		float[] b = new float[100];
		for (i = 0;i <= (n - 1);i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= (n - 1);i++)
		{
			if (Math.abs((b[i] / a[i]) - (b[0] / a[0])) <= 5 * (1e-2))
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else if (((b[i] / a[i]) - (b[0] / a[0])) > 5 * (1e-2))
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				System.out.print("worse");
				System.out.print("\n");
			}
		}
	return 0;
	}



}

