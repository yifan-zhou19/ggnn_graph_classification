package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int cnt;
		char[][] a = new char[999][41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		i = 1;
		cnt = 0;
		do
		{
			cnt += String.valueOf(*(a + i)).length();
			if (cnt <= 80)
			{
				System.out.print((a + i));
				if (cnt + String.valueOf(*(a + i + 1)).length() + 1 <= 80 && i != n)
				{
					System.out.print(" ");
				}
							cnt++;
				i++;
			}
			else
			{
				System.out.print("\n");
				cnt = 0;
			}
		}while (i <= n);
		return 0;
	}
}

