package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] ans = new double[1001][3];
		int i;
		int n;
		float dt;
		float a;
		float b;
		float c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			dt = b * b - 4 * a * c;
			if (dt == 0F)
			{
				ans[i][2] = 0;
				ans[i][0] = (-b + Math.sqrt(dt)) / a / 2;
			}
			else if (dt > 0F)
			{

				ans[i][2] = -1;
				ans[i][0] = (-b + Math.sqrt(dt)) / a / 2;
				ans[i][1] = (-b - Math.sqrt(dt)) / a / 2;
			}
			else
			{
				ans[i][2] = -2;
				ans[i][0] = -b / a / 2;
				ans[i][1] = Math.sqrt(-dt) / a / 2;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (ans[i][2] == 0)
			{
				System.out.printf("%.5f", "\n");
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", ans[i][0]);
			}
			else if (ans[i][2] == -1)
			{
				System.out.printf("%.5f", "\n");
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", ans[i][0]);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", ans[i][1]);
			}
			else
			{
				if (ans[i][0] != 0)
				{
				System.out.printf("%.5f", "\n");
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", ans[i][0]);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", ans[i][1]);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", ans[i][0]);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", ans[i][1]);
				System.out.printf("%.5f", "i");
				}
				else
				{
					System.out.printf("%.5f", "\n");
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", ans[i][1]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", ans[i][1]);
					System.out.printf("%.5f", "i");
				}

			}
		}
		return 0;
	}

}

