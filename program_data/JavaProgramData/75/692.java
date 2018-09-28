package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????? **
	//*?????? 1300062706 **
	//*???2013.10.31**
	//********************************
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int m;
		int k;
		int x;
		int y;
		int temp;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		char ch;
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			ch = System.in.read();
			while (ch == ',')
			{
				a[i] = x;
				i++;
				x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				ch = System.in.read();
			}
			if (ch == '\n')
			{
				a[i] = x;
				break;
			}
		}
		while ((y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			ch = System.in.read();
			while (ch == ',')
			{
				b[j] = y;
				j++;
				y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				ch = System.in.read();
			}
			if (ch == '\n')
			{
				b[j] = y;
				break;
			}
		}
		for (m = 0;m <= j;m++)
		{
			for (k = a[m];k < b[m];k++)
			{
				c[k]++;
			}
		}
		for (i = 1;i <= 999;i++)
		{
			if (c[0] < c [i])
			{
				c[0] = c[i];
			}
		}
		System.out.print(j + 1);
		System.out.print(" ");
		System.out.print(c[0]);
		System.out.print("\n");
		return 0;
	}


}

