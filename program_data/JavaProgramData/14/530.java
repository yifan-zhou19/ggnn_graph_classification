public class student
{
	   public int number;

	   public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			int b;
			int c;
			a[i].number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].total = b + c;
		}

		for (i = 0;i < 3;i++)
		{
			for (j = i;j < n;j++)
			{
				if (a[j].total > a[i].total)
				{
					t = a[i].total;
					a[i].total = a[j].total;
					a[j].total = t;
					t = a[i].number;
					a[i].number = a[j].number;
					a[j].number = t;
				}
			}

		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(a[i].number);
			System.out.print(' ');
			System.out.print(a[i].total);
			System.out.print("\n");
		}
		return 0;
	}

}

