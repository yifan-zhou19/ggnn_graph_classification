package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*????? 1300012845 **
	//*???2013.10.30  **
	//********************************
	public static int Main() //???
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int num = 0;
		int i;
		int t;
		int tmax = 0;
		int Nmax = 0;
		int[] N = new int[1000];
		char p = 0;
		do
		{
			x[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++;
			p = System.in.read();
		} while (p != '\n');
		num = 0;
		do
		{
			y[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++;
			p = System.in.read();
		} while (p != '\n');
		for (i = 0; i <= num; i++)
		{
			if (y[i] > tmax)
			{
				tmax = y[i];
			}
		}
		for (t = 0; t <= tmax; t++)
		{
			for (i = 0; i <= num; i++)
			{
				if (t < y[i] && t >= x[i])
				{
					N[t]++;
				}
			}
		}
		for (t = 0; t <= tmax; t++)
		{
			if (N[t] > Nmax)
			{
				Nmax = N[t];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(Nmax);
		System.out.print("\n");
		return 0;
	}

}

