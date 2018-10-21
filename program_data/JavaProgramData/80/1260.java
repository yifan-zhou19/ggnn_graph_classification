package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int n1 = 0;
		int n2 = 0;
		int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] t = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????
		for (i = 1;i <= a - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) //???366,??+365
			{
				n1 = n1 + 366;
			}
			else
			{
				n1 = n1 + 365;
			}
		}
		for (i = 1;i <= d - 1;i++)
		{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					n2 = n2 + 366;
				}
				else
				{
					n2 = n2 + 365;
				}
		}
		for (i = 1;i <= b - 1;i++)
		{
			n1 = n1 + t[i];
		}
		for (i = 1;i <= e-1;i++)
		{
			n2 = n2 + t[i];
		}
		if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && (b > 2)) //????+1
		{
			n1++;
		}
		if (((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0)) && (e > 2))
		{
			n2++;
		}
		System.out.print(n2 + f - n1 - c);
		System.out.print("\n");
		return 0;
	}
}

