public class person
{
	public int flag;
	public int count;
}

package <missing>;

public class GlobalMembers
{
	public static person[] p = tangible.Arrays.initializeWithDefaultpersonInstances(10001);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int g = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			p[i].flag = 1;
			p[j].count++;
		}
		for (int i = 0; i < n; i++)
		{
			if (p[i].flag == 0 && p[i].count == n - 1)
			{
				g = 1, cout << i << "\n";
			}
		}
		if (g == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

