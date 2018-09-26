package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			int year; //??????
			int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int a;
			int b;
			int x = 0;
			int j;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				m[1] = 29;
			}
			else
			{
				m[1] = 28; //????  ????2???
			}

			if (a > b)
			{
				for (j = b - 1;j < a - 1;j++)
				{
					x = x + m[j];
				}
				if (x % 7 == 0)
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
			else if (a < b)
			{
				for (j = a - 1;j < b - 1;j++)
				{
					x = x + m[j];
				}
				if (x % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			} //???????????7??
		}
		return 0;
	}

}

