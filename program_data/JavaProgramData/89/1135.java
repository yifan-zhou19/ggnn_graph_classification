public class shehui
{
	public int x;
}

package <missing>;

public class GlobalMembers
{
	public static shehui[] a = tangible.Arrays.initializeWithDefaultshehuiInstances(10000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[j].x++;
		}while (i != 0 || j != 0);
		for (i = 0; i < n; i++)
		{
			if (a[i].x == n - 1)
			{
				count++;
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (count == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

