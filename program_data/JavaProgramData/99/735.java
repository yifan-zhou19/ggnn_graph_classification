package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 0; //????????
		float[] s = {0F, 0F, 0F, 0F}; //???????
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a < 19)
			{
				s[0] = s[0] + 1;
			}
			else if (a > 18 && a < 36)
			{
				s[1] = s[1] + 1;
			}
			else if (a > 35 && a < 61)
			{
				s[2] = s[2] + 1;
			}
			else
			{
				s[3] = s[3] + 1;
			}
		}
		double[] c = {0.0, 0.0, 0.0, 0.0}; //???????
		c[0] = s[0] * 100 / n;
		c[1] = s[1] * 100 / n;
		c[2] = s[2] * 100 / n;
		c[3] = s[3] * 100 / n;
		System.out.print("1-18: ");
		System.out.printf("%.2f",c[0]);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("19-35: ");
		System.out.printf("%.2f",c[1]);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("36-60: ");
		System.out.printf("%.2f",c[2]);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("60??: ");
		System.out.printf("%.2f",c[3]);
		System.out.print("%");
		System.out.print("\n");
		return 0;
	}

}

