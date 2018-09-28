package <missing>;

public class GlobalMembers
{
	//*****************************************
	//*   ????                            *
	//*   ??????                        *
	//*   ?????2011?12?12?            *
	//*****************************************


	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int num;
		int flag;
		int sum;
		int[] a = new int[500000];
		int[] b = new int[500000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = 0;
		flag = 0;
		sum = 0;
		for (i = 0; ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++;
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		for (i = 0; i < n; i++)
		{
			q = b;
			for (p = a; p <= a + num - 1; p++)
			{
				if (p == i)
				{
					break;
				}
				else
				{
					if (q == i)
					{
						sum = sum + p;
					}
					q++;
				}
			}
			if (sum == n * (n - 1) / 2 - i)
			{
				flag = 1;
				System.out.print(i);
				break;
			}
			sum = 0;
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

