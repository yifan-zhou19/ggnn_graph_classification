package <missing>;

public class GlobalMembers
{
	//***************************
	//*????????        **
	//*????? 1300012921   **
	//*???2013.10.30        **
	//*************************** 
	public static int Main()

	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] time = new int[1001];
		int i = 0;
		char ch;

		do
		{
			i++;
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
		}while (ch == ',');

		i = 0;

		do
		{
			i++;
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
		}while (ch == ',');

		for (int j = 1; j <= i; j++)
		{
			for (int k = x[j]; k < y[j]; k++)
			{
				time[k] = time[k] + 1;
			}
		}

		int max = 0;
		for (int l = 1; l <= 1000; l++)
		{
			if (time[l] > max)
			{
				max = time[l];
			}
		}

		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

