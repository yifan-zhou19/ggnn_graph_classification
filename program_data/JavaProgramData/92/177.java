package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1010]; //a tian b wang
	public static int[] b = new int[1010];
	public static int judge(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int[] c = new int[1010];
			int[] d = new int[1010];
			if (n == 0)
			{
				break;
			}
			int i;
			int j;
			for (i = 0 ; i < n ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0 ; i < n ; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),judge);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),judge);
			j = 0;
			int res = 0;
			int mark = 0;
			int los = 0;
			int equ = 0;
			int l1 = 0;
			int r1 = n - 1;
			int l2 = 0;
			int r2 = n - 1;
			while (l1 <= r1 != 0 && l2 <= r2)
			{
				//cout <<l1<<r1<<l2<<r2<<' '<<res <<los <<equ;
				if (a[l1] > b[l2])
				{
					res++;
					l1++;
					l2++;
					continue;
				}
				if (a[r1] > b[r2])
				{
					res++;
					r1--;
					r2--;
					continue;
				}
				if (a[l1] == b[r2])
				{
					equ++;
					l1++;
					r2--;
					continue;
				}
				l1++;
				r2--;
				los++;
			}
	//		cout <<equ <<endl;
			System.out.print(res * 200 - los * 200);
			System.out.print("\n");
		}
	}
}

