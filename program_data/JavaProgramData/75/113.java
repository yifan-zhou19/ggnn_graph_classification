package <missing>;

public class GlobalMembers
{
	/**
	 *???6.cpp
	 *??????
	 *????????
	 *???10.12.29
	 */
	public static int Main()
	{
		int[] a = new int[1000]; //a,b,c?????????????????
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i;
		int j;
		int n = 0;
		int max = 0;
		char s;
		for (n = 0;;n++)
		{
			a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = System.in.read();
			if (s == '\n')
			{
				  break;
			}
		}
		for (n = 0;;n++)
		{
			b[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = System.in.read();
			if (s == '\n')
			{
				  break;
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j]++;
				if (c[j] > max)
				{
					max = c[j];
				}
			}
		}
		System.out.print(n + 1);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

