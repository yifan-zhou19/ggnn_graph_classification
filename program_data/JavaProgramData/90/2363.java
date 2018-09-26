package <missing>;

public class GlobalMembers
{
	public static int place(int m, int n)
	{
		if (m < 0)
		{
		  return (0);
		}
		if (n == 1)
		{
		  return (1);
		}
		return (place(m, n - 1) + place(m - n, n));
	}
	public static int Main()
	{
		int[] m = new int[20];
		int[] n = new int[20];
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
		  m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < t; i++)
		{
		  System.out.print(place(m[i], n[i]));
		  System.out.print("\n");
		}
		return (0);
	}
}

