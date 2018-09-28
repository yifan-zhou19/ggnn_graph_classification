package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[20];
		int[] m = new int[20];
		int k;
		int z;
		int[] a = new int[1000];
		int i; //i?r??,now????�??"?????????-
		int now;

		int j;
		for (k = 0;;k++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n[k] = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m[k] = Integer.parseInt(tempVar2);
		 }
		 if (n[k] == 0 && m[k] == 0)
		 {
			 break;
		 }
		}
		for (z = 0;z < k + 1;z++)
		{

		for (j = 1;j <= n[z];j++) //???????a[1]??
		{

			a[j] = j;
		}
		now = 1;
		for (j = 1;j < n[z];j++)
		{ //??n-1????????????

			i = 0;
			while (i < m[z])
			{
				if (a[now] == 0)
				{
					++now; //?????0?????????????

					if (now > n[z])
					{
						now = 1;
					}
					//continue;

				}
				else
				{ //??????

					i++; //i??????????

					if (i == m[z])
					{
						a[now] = 0;
					}
					++now;
					if (now > n[z])
					{
						now = 1;
					}
				}
			}
		}

		for (j = 1;j <= n[z];j++)
		{
			if (a[j] != 0)
			{
				System.out.printf("%d\n",a[j]);
			}
		}
		}
	}


}

