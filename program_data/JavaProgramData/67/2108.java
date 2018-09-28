package <missing>;

public class GlobalMembers
{
	/*
	 * ????AIDS.cpp
	 * ?????
	 * ????: 2011-12-30
	 * ????????
	 */
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		float[] c = new float[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = ((float)b[i] / a[i]);
			if (i != 0)
			{
				if (c[i] - c[0] > 0.05F)
				{
					System.out.print("better");
					System.out.print("\n");
					continue;
				}
				if (c[i] - c[0] < -0.05F)
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
		}
		return 0; //????
	}

}

