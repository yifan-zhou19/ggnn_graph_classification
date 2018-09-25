package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] c = new int[1001];
		int i;
		int sum;
		int k;
		int j;
		int m;
		int s;
		int max = 0;
		char d;
		for (i = 1;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = System.in.read();
			if (d != ',')
			{
			break;
			}
		}
		sum = i;
		for (k = 1;k <= i;k++)
		{
			b[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = System.in.read();
		}
		for (j = 1;j <= i;j++)
		{
			for (m = a[j];m < b[j];m++) //??c[m]??m???????? ????????????????
			{
			   c[m]++;
			}
		}
		for (s = 0;s <= 1000;s++)
		{
			if (c[s] >= max)
			{
			max = c[s];
			}
		}
		System.out.print(sum);
		System.out.print(" ");
		System.out.print(max);

		return 0;
	}
}

