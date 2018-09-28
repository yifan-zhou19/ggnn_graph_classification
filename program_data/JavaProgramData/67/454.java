package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n + 1];
		double[] c = new double[n + 1];
		int i;
		double[] b = new double[n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Double.SIZE / Byte.SIZE));
		for (i = 1; i <= n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = (double)(c[i] / a[i]);
		}
		for (i = 2; i <= n; i++)
		{
			if (b[i] - b[1] < (-0.05))
			{
				System.out.print("worse");
				System.out.print("\n");
			}
				else if (b[i] - b[1] > (0.05))
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

