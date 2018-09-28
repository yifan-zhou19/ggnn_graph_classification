package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][45]; //??????
		int sum = 0; //sum??????????
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 1;i <= n;i++)
		{
			if (sum == 0)
			{
				sum = String.valueOf(a[i]).length();
			}
			else if (String.valueOf(a[i]).length() + 1 + sum <= 80)
			{
				System.out.print(" ");
				sum = sum + 1 + String.valueOf(a[i]).length();
			}
			else if (String.valueOf(a[i]).length() + 1 + sum > 80)
			{
				System.out.print("\n");
				sum = String.valueOf(a[i]).length();
			}
			System.out.print(a[i]);
		}
		return 0;
	}
}

