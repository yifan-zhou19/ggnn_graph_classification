package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????                   **
	//*????? 1300012848        **
	//*???2013.10.31             **
	//********************************
	public static int Main()
	{
		int[] time = new int[1000];
		int[] x = new int[1000];
		int[] y = new int[1000];
		int people = 0;
		int max = 0;
		int i = 0;
		int j = 0;
		char c;
		do
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read(); //?????????
			i++; //??????????
		}while (c == ','); //????????????? ???????
		do
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			j++;
		}while (c == ',');
		for (int m = 0; m < i; m++)
		{
			for (int k = x[m]; k < y[m]; k++) //????? ??????????????
			{
				time[k] = time[k] + 1;
			}
		}
		for (int l = 0; l < 1000; l++)
		{
				if (max < time[l])
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

