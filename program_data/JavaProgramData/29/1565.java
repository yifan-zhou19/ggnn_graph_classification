package <missing>;

public class GlobalMembers
{
	//****************************
	//*????
	public static int Main()
	{
		int m;
		int n;
		double sum = 0;
		double a;
		double b;
		int i;
		int k;
		int p;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			a = 2;
			b = 1;
			for (k = 1;k <= n;k++)
			{
				sum = sum + a / b;
				p = a;
				a = a + b;
				b = p; //?????n??
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

