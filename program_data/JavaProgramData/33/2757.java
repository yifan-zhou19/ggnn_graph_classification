package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[256];
		int i;
		int n;
		char ch;
		a['A'] = 'T';
		a['T'] = 'A';
		a['G'] = 'C';
		a['C'] = 'G';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{
			ch = System.in.read();
			while (ch != '\n')
			{
				System.out.print(a[ch]);
				ch = System.in.read();
			}
			System.out.print('\n');
		}
		return 0;
	}

}

