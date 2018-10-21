package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	float[] a = new float[100];
	float[] b = new float[100];
	for (i = 0;i <= n - 1;i++)
	{
		a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	}
	float c;
	c = b[0] / a[0];
	for (i = 1;i <= n - 1;i++)
	{
		if (b[i] / a[i] - c > 0.05F)
		{
	  System.out.print("better");
	  System.out.print("\n");
		}
	else if (c - b[i] / a[i] > 0.05F)
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

