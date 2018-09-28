package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n; //n m ?????? ?d???????
		int m;
		int d;
		int e;
		int f;
		int i;

		e = 0;
		for (i = 0;i <= 299;i++)
		{
			a[i] = 1;
		}
		do
		{


			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			d = n;
			e = 0;
			for (i = 0;i <= 299;i++)
			{
				a[i] = 1;
			}

			if (n != 0 || m != 0)
			{ //?????? d????

				for (i = 0;i <= (n - 1);i++)
				{
					e = a[i] + e;
					if (e == m)
					{
						a[i] = 0;
						d = d - 1;
						e = 0;
					}
					if (i == n - 1)
					{
						i = -1;

					}
					if (d == 1)
					{
						break;
					}

				} //?????????
				for (f = 0;f <= n - 1;f++)
				{
					if (a[f] == 1)
					{
						System.out.printf("%d\n",f + 1);
					}

				}
			}
		} while (n != 0 || m != 0);



		return 0;
	}

}

