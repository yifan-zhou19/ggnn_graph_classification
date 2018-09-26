package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		float x; //z?????? t??????s?x?y??
		float y;
		float z;
		float t;
		float s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		z = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		t = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		x = t / z;
		for (i = 1;i < n;i++)
		{
			z = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			t = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y = t / z;
			s = x - y;
			if (Math.abs(s) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else
			{
				if (s > 0.05F)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					System.out.print("better");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

