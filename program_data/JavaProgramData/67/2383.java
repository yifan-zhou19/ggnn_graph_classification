package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	float[] a = new float[n];
	float[] b = new float[n];
	float c;
	a[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	b[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	c = b[0] / a[0];
	for (i = 1;i < n;i++)
	{
		a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	if (b[i] / a[i] <= c + 0.05 && b[i] / a[i] >= c - 0.05)
	{
	System.out.print("same");
	System.out.print("\n");
	}
	else if (b[i] / a[i] > c + 0.05)
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

