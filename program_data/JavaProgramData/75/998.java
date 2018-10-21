package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i = 0;
		int[] b = new int[1000];
		int j = 0;
		int k;
		int l;
		char ch = ',';
		while (ch == ',')
		{
			a[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
		}
		System.out.print(i);
		System.out.print(' ');
		while (j < i)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			for (l = a[j]; l < k; l++)
			{
				b[l]++;
			}
			j++;
		}
		k = 0;
		for (i = 0; i < 1000; i++)
		{
			k = (k > b[i]) ? k : b[i];
		}
		System.out.print(k);
		ch = System.in.read();
		return 0;
	}


}

