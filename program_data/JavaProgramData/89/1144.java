//******************************************************
//* ?????????
//* ????? 1200012858
//* ???2012-12-15
//******************************************************

public class people
{
	public int p;
	public int q;
	public int f;
}

package <missing>;

public class GlobalMembers
{
	public static people[] pp = tangible.Arrays.initializeWithDefaultpeopleInstances(100000);

	public static int Main()
	{
		int n;
		int i = 0;
		int count = 0;
		int[] num = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			i++;
			pp[i].p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pp[i].q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pp[i].f = 1;
			count++; // count ?????????
		}while (pp[i].p != 0 || pp[i].q != 0);
		count--;
		for (i = 0; i < n; i++)
		{
			for (int j = 1; j <= count; j++)
			{
				if (pp[j].q == i)
				{
					num[i]++;
				}
			}
			if (num[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

