package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //????
		int m;
		int n;
		int i;
		int[] a = new int[100];
		m = 0;
		n = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++) //??k?
		{
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (a[i] > m)
		   {
				   n = m;
				m = a[i];
		   }
		   else if (a[i] > n)
		   {
				n = a[i];
		   }
		}
		System.out.print(m);
		System.out.print("\n");
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}

