package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] a = new float[1000];
		float[] b = new float[1000];
		float[] c = new float[1000];
		for (int i = 0;i < num;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c[i] = b[i] / a[i];
		}
		for (int j = 1;j < num;j++)
		{
			if (c[j] - c[0] > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (c[0] - c[j] > 0.05F)
			{
					System.out.print("worse");
					System.out.print("\n");
			}
			//if(-0.05<=(c[j]-c[0])<=0.05)
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
			return 0;
	}
}

