package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = n;
		for (i = 0;i < 100;i++)
		{
			if (a[i] % 2 == 1 && a[i] != 1)
			{
			   a[i + 1] = a[i] * 3 + 1;
				System.out.print(a[i]);
				System.out.print("*3+1=");
				System.out.print(a[i + 1]);
				System.out.print("\n");
			}
			if (a[i] % 2 == 0)
			{
				a[i + 1] = a[i] / 2;
				System.out.print(a[i]);
				System.out.print("/2=");
				System.out.print(a[i + 1]);
				System.out.print("\n");
			}
			if (a[i] == 1)
			{
			   System.out.print("End");
			   break;
			}
		}
			return 0;
	}
}

