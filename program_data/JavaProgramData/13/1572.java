package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[c] = 1;
		System.out.print(c);
		while ((c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a[c] == 0)
			{
			  System.out.print(" ");
			  System.out.print(c);
			  a[c] = 1;
			}
		}
	//for (;;) ;          
		return 0;
	}



}

