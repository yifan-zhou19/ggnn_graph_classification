package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 9_7
	 * author  ??
	 * date    2010-11-24
	 * description
	           ???????????????????????
	*/



	public static int Main()
	{
		int[] s = new int[1000];
		int n;
		int a;
		int b;
		int i;
		int max = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 1;
		for (i = a; i < 1000; i++)
		{
			s[i]++;
		}
		while (System.in.read() == ',')
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = a; i < 1000; i++)
			{
				 s[i]++;
			}
			n++;
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = b; i < 1000; i++)
		{
			s[i]--;
		}
		while (System.in.read() == ',')
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = b; i < 1000; i++)
			{
				s[i]--;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			if (s[i] > max)
			{
				max = s[i];
			}
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}

}

