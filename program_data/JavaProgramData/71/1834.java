package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int m1;
		int m2;
		int length1 = 0;
		int length2 = 0;
		int length;
		int[] A = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] B = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			length1 = 0;
			length2 = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			for (j = 1;j < m1;j++)
			{
				length1 = A[j] + length1;
			}
			for (j = 1;j < m2;j++)
			{
				length2 = A[j] + length2;
			}
			length = Math.abs(length1 - length2);
		}
		else
		{
			for (j = 1;j < m1;j++)
			{
				length1 = B[j] + length1;
			}
			for (j = 1;j < m2;j++)
			{
				length2 = B[j] + length2;
			}
			length = Math.abs(length1 - length2);
		}
		if (length % 7 == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		}

		return 0;
	}

}

