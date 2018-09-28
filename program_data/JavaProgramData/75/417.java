package <missing>;

public class GlobalMembers
{
	/*???:?????
	**?  ?:??
	**?  ?:2010?11?30?
	*/
	public static int Main()
	{
		int[] r = new int[1000];
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i = 0;
		int j;
		int n = 0;
		int out_max;
		int max;
		char temp;
		while (true)
		{
			x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = System.in.read();
			if (temp == 10)
			{
				break;
			}
		}
		i = 0;
		while (true)
		{
			y[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = System.in.read();
			if (temp == 10)
			{
				break;
			}
		}
		n = i; //???,i?0??
		out_max = 0;
		for (i = 0; i < n; i++)
		{
			if (out_max < y[i])
			{
				out_max = y[i];
			}
		} //?????????
		for (i = 0; i < out_max; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (x[j] <= i)
				{
					r[i]++;
				}
				if (y[j] <= i)
				{
					r[i]--;
				}
			} //??????????
		}
		max = r[0];
		for (i = 0; i < out_max; i++)
		{
			if (max < r[i])
			{
				max = r[i];
			}
		} //????????????
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

