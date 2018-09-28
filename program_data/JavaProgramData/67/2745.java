package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	float c;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	float x;
	float y;
	x = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	y = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	float z = y / x;
	float a;
	float b;
	int i;
	for (i = 1;i < n;i++)
	{
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = b / a;
		if (c - z > 0.05F)
		{
			System.out.print("better");
			System.out.print("\n");
		}
		if (z - c > 0.05F)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		if (c >= z - 0.05 && c <= z + 0.05)
		{
			System.out.print("same");
			System.out.print("\n");
		}
	}
		return 0;
	}

}

