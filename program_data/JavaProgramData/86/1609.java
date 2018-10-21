package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int c;
		int t;
		int[] u = new int[60];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c = 0;
				t = -3;
				u[0] = 0;
				for (i = 1;i <= m;i++)
				{
					u[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}

				for (i = 1;i <= m;i++)
				{
						if (u[i] - u[i - 1] + t + 3 <= 60)
						{
								t = u[i] - u[i - 1] + t + 3;
								c = u[i];
						}
						else
						{
							break;
						}
				}
						t = t + 3;
				if (t < 60)
				{
					c = c + 60 - t;
				}
				System.out.print(c);
				System.out.print("\n");
				n--;
		}
	return 0;
	}

}

