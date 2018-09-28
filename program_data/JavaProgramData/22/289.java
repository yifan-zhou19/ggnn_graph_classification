package <missing>;

public class GlobalMembers
{
	public static int sort(int[] in, int n)
	{
		int i = 0;
		int t = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (in[i] > t)
			{
			t = in[i];
			j = i;
			}
		}
		return j;
	}
	public static int change(int[] in, int n, int j)
	{
		int a = 0;
		int i = 0;
		a = in[j];
		in[j] = 0;
		i = sort(in, n);
		if (a == in[i])
		{
			return change(in, n, i);
		}
		else
		{
			return i;
		}
	}
	public static void Main()
	{
		int i = 0;
		int n = 0;
		int a = 0;
		int[] in = new int[300];
		int j = 0;
		int s = 0;
		char c;
	while (scanf("%d,", in[i], c) != EOF)
	{
		i++;
		n++;
	}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			j = sort(in, n);
		s = change(in, n, j);
			if (in[s] == 0)
			{
				System.out.print("No");
			}
			else
			{
			System.out.printf("%d",in[s]);
			}
		}
	}

}
