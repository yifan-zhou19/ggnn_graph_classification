package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		float s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = 2;
			b = 1;
			s = 0F;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j <= m;j++)
			{
				s += ((float)a) / b;
				a += b;
				b = a - b;
			}
			System.out.printf("%.3f\n",s);
		}
		return 0;
	}

}

