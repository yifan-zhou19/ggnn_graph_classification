package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] d = new int[1000];
		int i;
		int j;
		int p;
		String c = new String(new char[1000]);
		for (i = 0;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() != ',')
			{
				i++;
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c.charAt(j));
		}
		for (j = 0;j < i;j++)
		{
			for (p = a[j];p < b[j];p++)
			{
				d[p]++;
			}
		}
		p = 0;
		for (j = 0;j < 1000;j++)
		{
			if (d[j] > p)
			{
				p = d[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

