package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int e;
		float[] eff = new float[100];
		float mod;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mod = e * 1.0 / t;
		for (int i = 0;i < n - 1;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			eff[i] = e * 1.0 / t;
		}
		for (int i = 0;i < n - 1;i++)
		{
			if ((eff[i] - mod) > 0.05)
			{
				System.out.print("better");
			}
			else if ((mod - eff[i]) > 0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
			System.out.print("\n\n");
		}
		return 0;
	}


}

