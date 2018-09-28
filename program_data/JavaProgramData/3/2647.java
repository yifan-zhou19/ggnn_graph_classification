package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[2001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	 /*   for (int i=0;i<n-1;i++)
	    for (int j=i+1; j<n; j++)
	    if (a[i]>a[j]) {
	                   int t;
	                   t=a[j];
	                   a[j]=a[i];
	                   a[i]=t;
	                   }      */
		int p = 0;
		for (int i = 0; i < n; i++)
		{
		for (int j = i + 1; j < n; j++)
		{
		  if (a[i] + a[j] == k)
		  {
			  p = 1;
		  }
		}
		}

		if (p == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}

		return 0;

	}
}

