package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int a;
		int b;
		int c;
		int[] A = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int sum = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b > c)
			{
				A[0] = b;
			b = c;
			c = A[0];
			}
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			{
				A[2] = A[2] + 1;
				for (int j = b;j < c;j++)
				{
					sum += A[j];
				}
				//cout<<sum<<" "<<b<<" "<<c;
				if (sum % 7 == 0)
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
				A[2]--;
			}
			else
			{
				for (int j = b;j < c;j++)
				{
					sum += A[j];
				}
				if (sum % 7 == 0)
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
			}

	System.out.print("\n");
		}
		return 0;
	}
}

