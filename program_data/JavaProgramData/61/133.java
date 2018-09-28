package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[n];
	for (i = 0;i < n;i++)
	{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int[] b = new int[20];
	for (j = 0;j < n;j++)
	{
		   b[0] = 1;
		b[1] = 1;
		if (a[j] <= 2)
		{
		 System.out.print("1");
		 System.out.print("\n");
		}
		else
		{
			for (i = 2;i < a[j];i++)
			{
			  b[i] = b[i - 1] + b[i - 2];
			}
		System.out.print(b[i - 1]);
		System.out.print("\n");
		}
	}
	return 0;
	}
}

