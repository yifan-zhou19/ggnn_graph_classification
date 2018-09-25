package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum; //???sum?????q,f?????,s??????
		int q = 0;
		int f;
		int s;
		int n = 1;
		int m = 1;
		int[] a = new int[300];
		while (n != 0 || m != 0)
		{
			for (int i = 1;i <= 300;i++) //?????
			{
				a[i - 1] = i;
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n != 1)
			{
				sum = ((1 + n) * n) / 2;
				q = 0;
				f = m;
				s = n;
				do
				{
					if (f % s == 0)
					{
						f = s;
					}
					else
					{
						f %= s;
					}
					sum -= a[f - 1]; //????
					for (int i = f;i <= s;i++) //??????f??????????????????
					{
						a[i - 1] = a[i];
					}
					q++;
					s--;
					f += (m - 1);
				}while (q < n - 1);
				System.out.print(sum);
				System.out.print("\n");
			}
			else
			{
				System.out.print(n);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

