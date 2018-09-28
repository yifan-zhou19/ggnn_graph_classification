package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012861 **
	//*???2013.10.31  **
	//********************************
	public static int Main()
	{
		int[] x = new int[1002];
		int[] y = new int[1002];
		int[] z = new int[1002];
		int i;
		int j;
		int count;
		int t;
		char c;
		count = 1;
		i = 1;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = System.in.read(); //??????
		while (c == ',') //???????????????
		{
			count++; //??+1
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read(); //??????
			i++;
		}
		i = 1; //????
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = System.in.read();
		while (c == ',')
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		}
		i--;
		for (; i >= 0; i--)
		{
			for (j = x[i]; j < y[i]; j++) //??????????????+1
			{
				z[j]++;
			}
		}
		for (j = 1; j <= 1000; j++)
		{
			if (z[j] < z[j - 1]) //????z????? ????????????
			{
				z[j] = z[j - 1];
			}
			t = z[j];
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}


}

