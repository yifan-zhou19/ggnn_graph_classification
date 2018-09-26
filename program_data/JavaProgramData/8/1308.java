package <missing>;

public class GlobalMembers
{
	public static void paixu(int n, int[] a)
	{
		if (n == 0)
		{
			return;
		}
		int x;
		int i;
		int min = a[0];
		for (x = 0;x < n;x++)
		{
			if (a[x] <= min)
			{
				min = a[x];
			}
		}
		if (n > 1)
		{
		System.out.print(min);
		System.out.print(' ');
		}
		if (n == 1)
		{
			System.out.print(min);
		}
		for (x = 0;x < n;x++)
		{
			if (a[x] == min)
			{
				break;
			}
		}
		for (i = x;i < n - 1;i++)
		{
			a[i] = a[i + 1];
		}
		return paixu(n - 1,a);
	}
	public static int Main()
	{
		int m1;
		int m2;
		int x;
		int[] s = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 0;x < m1;x++)
		{
			s[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		paixu(m1, s);
		System.out.print(' ');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		for (x = 0;x < m2;x++)
		{
			s[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		paixu(m2, s);
		return 0;
	}

}

