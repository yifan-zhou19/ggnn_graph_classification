package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int t = 0;
		int m = 0;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
						 {
														t++;
														if (i == n && t >= m)
														{
														m = t;
														}
						 }
						 else
						 {
							 if (t >= m)
							 {
							 m = t;
							 }
							 t = 0;
						 }
		}
		System.out.print(m);
		System.out.print("\n");


		return 0;
	}
}

