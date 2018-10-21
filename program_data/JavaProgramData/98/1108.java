package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][50];
		for (i = 1;i <= n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int count = 0;
		for (i = 1;i <= n;i++)
		{
			count = count + String.valueOf(a[i]).length();
			if (count <= 80)
			{
				if (i < n)
				{
				System.out.print(a[i]);
				if (count + 1 + String.valueOf(a[i + 1]).length() <= 80)
				{
					System.out.print(" ");
				}
				count++;
				}
				else if (i == n)
				{
					System.out.print(a[n]);
				}
			}
			else if (count > 80)
			{
				if (i < n)
				{
				count = String.valueOf(a[i]).length();
				System.out.print("\n");
				System.out.print(a[i]);
				System.out.print(" ");
				count++;
				}
				else if (i == n)
				{
					System.out.print(a[n]);
				}
			}
		}
	}
}

