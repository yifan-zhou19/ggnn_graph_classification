package <missing>;

public class GlobalMembers
{
	// ?????????? ?? 1000062708
	public static int Main()
	{
		int[][] ac = new int[100][100];
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int a;
		int b;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < a;j++)
			{
				for (k = 0;k < b;k++)
				{
					ac[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < a;j++)
			{
				if (j == 0 || j == a - 1)
				{
					for (p = ac[j];p < ac[j] + b;p++)
					{
						s += *p;
					}
				}
				else
				{
					p = ac[j];
					s = s + *p + *(p + b - 1);
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}




}

