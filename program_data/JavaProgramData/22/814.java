package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int[] a = new int[300];
		int m = 0;
		int i = 0;
		int j;
		int max;
		int sec = -1;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				a[i++] = m;
				m = 0;
			}
			else
			{
				m = m * 10 + c - 48;
			}
		}
		a[i++] = m;
		max = a[0];
		for (j = 1;j < i;j++)
		{
			if (a[j] > max)
			{
				sec = max;
				max = a[j];
			}
			if ((a[j] < max) && (a[j]> sec))
			{
				sec = a[j];
			}
		}
			if (sec == -1)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",sec);
			}
	}


}
