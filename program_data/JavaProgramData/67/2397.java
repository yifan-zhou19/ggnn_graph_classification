package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[10000];
		float lin;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			lin = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i] = a[i] / lin;
		}
		for (i = 1;i < n;i++)
		{
			if ((a[i] - a[0]) > 0.04999999)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((a[0] - a[i]) > 0.04999999)
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

