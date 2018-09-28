package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char b;
		cin.get(b);
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] c = new int[100];
		int d;
		int i;
		for (i = 1;i < n;i++) //??
		{
			   d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  c[i] = d;
			  cin.get(b);
			  a[i] = b;
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[n] = d;
		for (i = n;i > 1;i--) //????
		{
			  System.out.print(c[i]);
			System.out.print(a[i - 1]);
		}
		System.out.print(c[1]);

		return 0;
	}
}

