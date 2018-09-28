package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			if (n >= 100)
			{
				n -= 100;
				a[100]++;
			}
			else if (n >= 50)
			{
				n -= 50;
				a[50]++;
			}
			else if (n >= 20)
			{
				n -= 20;
				a[20]++;
			}
			else if (n >= 10)
			{
				n -= 10;
				a[10]++;
			}
			else if (n >= 5)
			{
				n -= 5;
				a[5]++;
			}
			else if (n >= 1)
			{
				n -= 1;
				a[1]++;
			}
		}
		System.out.print(a[100]);
		System.out.print("\n");
		System.out.print(a[50]);
		System.out.print("\n");
		System.out.print(a[20]);
		System.out.print("\n");
		System.out.print(a[10]);
		System.out.print("\n");
		System.out.print(a[5]);
		System.out.print("\n");
		System.out.print(a[1]);
		System.out.print("\n");
		return 0;
	}



}

