package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int count = 1;
	int[] a = new int[100001];
	int k;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= n;i++)
	{
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (int i = 1;i <= n;i++)
	{
		   if (a[i] != k)
		   {
				a[count] = a[i];
				count++;
		   }
	}

	for (int i = 1;i <= count - 2;i++)
	{
	System.out.print(a[i]);
	System.out.print(' ');
	}
	System.out.print(a[count - 1]);

	return 0;
	}

}

