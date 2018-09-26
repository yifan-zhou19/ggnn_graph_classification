package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n = 0;
	int i = 0;
	int x = 1;
	int m = 1;
	int t = 1;
	int s = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[10];
	for (i = 0;i < n;i += 1)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i += 1)
	{
	 for (x = 2;x < a[i];x += 1)
	 {
				  s = m + t;
			  m = t;
			  t = s;
	 }

		  System.out.print(t);
		  System.out.print("\n");
		  m = 1,t = 1,s = 0;
	}
	return 0;
	}

}

