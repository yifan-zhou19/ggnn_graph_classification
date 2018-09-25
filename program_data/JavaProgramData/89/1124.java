public class man
{
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static man[] person = tangible.Arrays.initializeWithDefaultmanInstances(10000);
	public static int Main()
	{
		int n = 0;
		int x = 0;
		int y = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0 && y == 0)
			{
				break;
			}
			person[x].a++;
			person[y].b++;
		}
		for (i;i < n;i++)
		{
			if (person[i].a == 0 && person[i].b == n - 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

