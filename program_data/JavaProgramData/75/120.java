package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[10000];
		int[] y = new int[10000];
		int i = 1;
		int j;
		int k;
		int[] people = new int[1001];
		int mp = 0;
		char t;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.get(t);
		while (t != '\n')
		{
			x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(t);
		}
		for (j = 0;j < i;j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(t);
		}
		for (j = 0;j < 1000;j++)
		{
			for (k = 0;k <= i;k++)
			{
				if (j >= x[k] != 0 && j < y[k])
				{
					people[j]++;
				}
			}
			if (people[j] > mp)
			{
				mp = people[j];
			}
		}
		System.out.print(i);
		System.out.print(' ');
		System.out.print(mp);
		return 0;
	}
}

