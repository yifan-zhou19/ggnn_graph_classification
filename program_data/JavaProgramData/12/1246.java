package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int n;
		double[] f = new double[15];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != -1)
		{
			i = 0;
			while (a != 0)
			{
				f[i] = a;
				 i++;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			j = i;
			n = 0;
			for (i = 0 ; i < j ; i++)
			{
				for (k = i + 1 ; k < j ; k++)
				{
					f[k] = f[k] * 1.0;
					if ((f[k] / f [i]) == 2.0 || (f[i] / f [k]) == 2.0)
					{
						n = n + 1;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}
}

