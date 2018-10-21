package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int n;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = n / 100;
			n = n % 100;
			i++;
			a[i] = n / 50;
			n = n % 50;
			i++;
			a[i] = n / 20;
			n = n % 20;
			i++;
			a[i] = n / 10;
			n = n % 10;
			i++;
			a[i] = n / 5;
			n = n % 5;
			i++;
			a[i] = n;
			for (i = 0;i <= 5;i++)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
			return 0;
	}

}

