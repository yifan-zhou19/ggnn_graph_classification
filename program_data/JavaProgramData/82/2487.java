package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[101];
		int[] b = new int[101];
		int t = 0;
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{

			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
				temp = temp + 1;

			if (temp > t)
			{
				t = temp;
			}
			}
			else
			{
				temp = 0;
			}
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

