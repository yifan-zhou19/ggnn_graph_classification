package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 1;
		int max;
		int second = -1;
		int num = 0;
		int[] a = new int[300];
		char c;
		i = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				a[i] = num;
				num = 0;
				i++;
				n++;
			}
			else
			{
				num = num * 10 + c - '0';
			}
		}
		a[i] = num;
		max = a[0];
		for (i = 1;i <= n - 1;i++)
		{
			if (max < a[i])
			{
				second = max;
				max = a[i];
			}
			else if (second < a[i] && a[i] < max)
			{
				second = a[i];
			}
		}
		if (n == 1 || second == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",second);
		}
		return 0;
	}


}
