package <missing>;

public class GlobalMembers
{
	public static int erchashu(int[] a, int n)
	{
		int i;
		a[0] = n;
		if (n != 1)
		{
			for (i = 1;;i++)
			{
				a[i] = a[i - 1] / 2;
				if (a[i] == 1)
				{
					break;
				}
			}
			return i;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int a;
		int b;
		int[] A = new int[1000];
		int[] B = new int[1000];
		int m;
		int n;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		m = erchashu(A, a);
		n = erchashu(B, b);
		{
			if (A[0] == B[0])
			{
				System.out.printf("%d\n",A[0]);
			}

			else
			{
				for (p = m,q = n; ;p--,q--)
				{
					if (A[p] == B[q])
					{
						continue;
					}
					else if (A[p] != B[q])
					{
						System.out.printf("%d\n",A[p + 1]);
						break;
					}

				}
			}
		}
	}




}

