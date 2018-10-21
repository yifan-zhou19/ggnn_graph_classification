package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????  **
	//*?????? 1300012946 **
	//*???2013.10.31  **
	//********************************
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] a = new int[1001];
		int j;
		int i;
		int k;
		int most = 0;
		char ch;
		for (i = 0 ; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (i = 0 ; ; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (j = 0 ; j <= i ; j++)
		{
			for (k = x[j] ; k < y[j] ; k++)
			{
			a[k]++;
			}
		}
		for (j = 0 ; j < 1000; j++)
		{
			most = most > a[j] != 0?most:a[j];
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(most);
		return 0;
	}
}

