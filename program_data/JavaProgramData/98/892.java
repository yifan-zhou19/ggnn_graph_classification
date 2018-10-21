package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][40];
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			if (k == 1)
			{
				sum = sum + String.valueOf(a[i]).length();
			}
			else
			{
				sum = sum + String.valueOf(a[i]).length() + 1;
			}
			if (sum <= 80 && k != 1)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			else if (sum <= 80 && k == 1)
			{
				k = 0;
				System.out.print(a[i]);
			}
			if (sum > 80)
			{
				System.out.print("\n");
				System.out.print(a[i]);
				sum = String.valueOf(a[i]).length();
			}
			else if (sum == 80)
			{
				System.out.print("\n");
				sum = 0;
				k = 1;
			}
		}
		return 0;
	}

}

