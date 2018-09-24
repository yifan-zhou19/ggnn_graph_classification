package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //a[100]????????t?????,half?????
		int i;
		int[] a = new int[100];
		int t;
		int half;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n % 2 == 0)
		{
			half = n / 2;
		}
		else
		{
			half = (n - 1) / 2;
		}
	for (i = 0;i < half;i++)
	{
		t = a[i];
		a[i] = a[n - i - 1];
		a[n - 1 - i] = t;
	} //????
	for (i = 0;i < n - 1;i++)
	{
		System.out.print(a[i]);
		System.out.print(" ");
	}
	   System.out.print(a[n - 1]);
	   System.out.print("\n");
		return 0;
	}

}

