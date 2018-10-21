package <missing>;

public class GlobalMembers
{
	//***********************************************************
	//*    name: 5.cpp                                          *
	//*    author:??                                          *
	//*    date: 2013-10-30                                     *
	//*    description? ?????                             *
	//***********************************************************
	public static int Main()
	{
		int[] a = new int[1000];
		int i = 0;
		int d;
		int sum = 0;
		int j;
		int max = 1;
		while ((d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a[i] = d;
			i++;
			sum++;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		int[] b = new int[1000];
		i = 0;
		while ((d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			b[i] = d;
			i++;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		int[] c = new int[1000];
		for (i = 0 ; i < sum ; i++)
		{
			for (j = a[i];j < b[i] ;j++)
			{
				c[j]++;
			}
		}
		for (j = 0;j < 1000; j++)
		{
			if (max < c[j])
			{
				max = c[j];
			}
		}
		System.out.print(sum);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

