package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float a; //?????????
		float b;
		float c;
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = b / a; //???????
		float[] d = new float[100]; //??????,??f????
		float[] e = new float[100];
		float[] f = new float[100];
		int i; //??????
		for (i = 1;i <= n - 1;i++)
		{
			d[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			e[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			f[i] = e[i] / d[i];
		}
		//????????
		int j;
		for (j = 1;j <= n - 1;j++)
		{
				if (f[j] - c > 0.05F)
				{
				System.out.print("better");
				System.out.print("\n");
				}
			else if (f[j] - c < -0.05F)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (f[j] - c >= -0.05F && f[j] - c <= 0.05F)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		System.in.read();
		return 0;
	}
}

