package <missing>;

public class GlobalMembers
{
	// *****************************************************************************
	//*?????????.cpp
	//*??;1300012725
	//*?????2013.11
	//*??????????
	//******************************************************************************


	public static int Main()
	{
		int[] x = new int[2000]; //????t[2000]??????????max???????i?????j,k??????
		int[] y = new int[2000];
		int[] t = new int[2000];
		int i = 1;
		int max;
		int j;
		int k;

		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() != '\n') //??????
		{
			i++;
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (System.in.read() != '\n') //??????
		{
			i++;
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1; j <= i; j++)
		{
			for (k = x[j]; k < y[j]; k++)
			{
				t[k]++; //??????????????????????1
			}
		}
		max = t[0];
		for (int q = 1; q < 1000; q++)
		{
			if (t[q] > max)
			{
				max = t[q]; // ?max???????
			}
		}
		System.out.print(i);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}

}

