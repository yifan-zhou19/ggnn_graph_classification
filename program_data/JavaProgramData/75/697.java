package <missing>;

public class GlobalMembers
{
	//********************************
	//*????5.cpp   **
	//*?????? 1300012966 **
	//*???2013.10.30  **
	//*????????   **
	//********************************
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] m = new int[1001];
		int n;
		char s;
		i = 1;
		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = System.in.read();
		while (s == ',')
		{
			i++;
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = System.in.read();
		}
		i = 1;
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = System.in.read();
		while (s == ',')
		{
			i++;
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = System.in.read();
		}
		for (j = 1; j <= 1000; j++)
		{
			for (k = 1; k <= i; k++)
			{
				if (j >= x[k] != 0 && j < y[k])
				{
					m[j]++;
				}
			}
		}
		n = 0;
		for (j = 1; j <= 1000; j++)
		{
			if (n < m[j])
			{
				n = m[j];
			}
		}
			System.out.print(i);
			System.out.print(" ");
			System.out.print(n);
		return 0;
	}








}

