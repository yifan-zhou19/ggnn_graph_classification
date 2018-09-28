public class person
{
	public int knownum;
	public int welknownnum;
}

package <missing>;

public class GlobalMembers
{
	public static person[] p = tangible.Arrays.initializeWithDefaultpersonInstances(100000);

	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (i = 0; i < n; i++)
		{
			p[i].knownum = 0;
			p[i].welknownnum = 0;
		}
		int j = 0;
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				p[i].knownum++;
				p[j].welknownnum++;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (p[i].knownum == 0 && p[i].welknownnum == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
	}

}

