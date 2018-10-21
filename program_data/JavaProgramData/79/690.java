package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int n;
		int m;
		int i;
		int k;
		int j;
		int s;
		int king;
		for (j = 1;;j++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   if (m != 0 && n != 0 && m != 1)


		   {
			k = 0;
			for (i = 1;i <= n;i++)
			{
				a[i] = i;
			}
			do
			{




				for (i = 1;i <= n;i++)
				{
					if (a[i] == 0)
					{
						k = k;
					}
					else
					{
						k = k + 1;
					}
					if (k == m)
					{
						a[i] = 0;
						k = 0;
					}

				}
				s = 0;
				for (i = 1;i <= n;i++)
				{
					if (a[i] > 0)
					{
						s = s + 1;
					}
				}
			}while (s > 1);
			for (i = 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
					king = a[i];
				}
			}

		System.out.printf("%d\n",king);
		   }
		if (m == 0 && n == 0)
		{
			break;
		}
		if (m == 1)
		{
			System.out.printf("%d\n",n);
		}
		}
	}


}

