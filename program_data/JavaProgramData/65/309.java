package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int[] b = new int[300];
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
						 if (a[i] == b[i])
						 {
							 continue;
						 }
						 if ((a[i] - b[i]) == 1)
						 {
							 m--;
						 }
						 if ((b[i] - a[i]) == 1)
						 {
							 m++;
						 }
						 if ((a[i] - b[i]) == 2)
						 {
							 m++;
						 }
						 if ((b[i] - a[i]) == 2)
						 {
							 m--;
						 }
		}
		if (m > 0)
		{
			System.out.print("A");
		}
		if (m < 0)
		{
			System.out.print("B");
		}
		if (m == 0)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

