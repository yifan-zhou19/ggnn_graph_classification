package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????      **
	//*?????? 1300012757 **
	//*???2013.10.30  **
	//********************************
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int start;
		int end;
		int i = 0;
		do
		{
			start = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = start;
			i++;
		}while (System.in.read() == ',');
		i = 0;
		do
		{
			end = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = end;
			i++;
		}while (System.in.read() == ',');
		int t0 = 0;
		int t = 0;
		for (int j = 0;j < 1000 ; j++)
		{
			for (int p = 0; p < i; p++)
			{
				if (a[p] <= j != 0 && b[p] > j)
				{
					t++;
				}
			}
			if (t > t0)
			{
				t0 = t;
			}
			t = 0;
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(t0);
		return 0;

	}

}

