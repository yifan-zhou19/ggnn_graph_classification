package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int m = 0;
	public static int s = 1;
	public static void temp(int b,int k,int c)
	{
		for (int i = k;i <= b;i++) //????
		{

			if (b % i == 0)
			{
				b = b / i;
				s = s * i;
				k = i;
				if (s == c)
				{
					m++;

				}
				else
				{

					temp(b, k, c);
				}
					s = s / i; //??
					b = b * i;

			}
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp(a, 2, a); //??
			System.out.print(m);
			System.out.print("\n");
			m = 0;
		}

		return 0;
	}
}

