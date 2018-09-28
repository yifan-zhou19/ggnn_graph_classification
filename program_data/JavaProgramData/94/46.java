package <missing>;

public class GlobalMembers
{
	//???2010?11?6?
	//???1000010586_???
	//?????????

	public static int Main()
	{
		int N;
		int m = 0;
		int i;
		int j;
		int k;
		int num;
		int t;
		int l;
		int[] a = new int[10000];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= N - 1 ; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 == 1)
			{
				a[m] = num;
				m++;
			}
		}
		for (j = 0 ; j <= m - 1 ; j++)
		{
			for (k = j + 1 ; k <= m - 1 ; k++)
			{
				if (a[j] > a[k])
				{
					t = a[j];
					a[j] = a[k];
					a[k] = t;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.print(a[0]);
		for (l = 1 ; l <= m - 1 ; l++)
		{
			System.out.print(",");
			System.out.print(a[l]);
		}
		return 0;
	}





}

