package <missing>;

public class GlobalMembers
{
	public static int m = 0; //??????m,n,???????????,??int?????????,???????????
	public static int n = 0;

	public static void Get_In(int[] a, int[] b) //????????,?????????????
	{
		int i = 0;
		int j = 0;
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void Ranking(int[] a, int l)
	{
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = 0;i < (l - 1);i++)
		{
			for (j = (i + 1);j < l;j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void Combine(int[] a, int[] b)
	{
		int i = 0;
		for (i = 0;i < n;i++)
		{
			a[m + i] = b[i];
		}
	}

	public static void Turn_Out(int[] a)
	{
		int i = 0;
		for (i = 0;i < (m + n);i++)
		{
			if (i < (m + n - 1))
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else if (i == (m + n - 1))
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
	}

	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Get_In(a, b);
		Ranking(a, m);
		Ranking(b, n);
		Combine(a, b);
		Turn_Out(a);
		return 0;
	}

}

