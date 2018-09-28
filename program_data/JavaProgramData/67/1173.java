package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[100]; //????
		float p;
		float q;
		float standard;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		q = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		standard = q / p; //?????
		for (i = 0;i < n - 1;i++) //??????
		{
			p = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			q = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i] = q / p;
		}
		for (i = 0;i < n - 1;i++) //???????????
		{
			if (a[i] - standard > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (standard - a[i] > 0.05F)
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

