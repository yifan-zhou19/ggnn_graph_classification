package <missing>;

public class GlobalMembers
{
	//********************************
	//* ???????? **
	//* ????? 1300012990 **
	//* ???2013.10.31 **
	//********************************
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] m = new int[1001];
		int x;
		int y;
		int num = 0;
		char ch;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			i++;
		}while (ch != '\n');
		do
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			j++;
		}while (ch != '\n');
		for (x = 0;x < i;x++)
		{
			for (y = a[x];y < b[x];y++)
			{
				m[y] = m[y] + 1;
			}
		}
		for (y = 0;y < 1000;y++)
		{
			if (m[y] > num)
			{
				num = m[y];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(num);
		return 0;
	}






}

