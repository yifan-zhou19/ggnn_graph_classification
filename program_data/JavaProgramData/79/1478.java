package <missing>;

public class GlobalMembers
{
	//******************************************************************************
	//??????????                                                         *
	//????wayne                                                                *
	//?????10.23                                                              *
	//******************************************************************************
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[301];
		int i;
		int j;
		int t;
		int k;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) //??????????????
		{
		   for (k = 1;k <= n;k++)
		   {
			   a[k] = 1; //??????????1
		   }
		   i = 1;
		   for (j = n;j > 1;j--) //j?????????????1???????
		   {
			   t = 0;
				while (t < m) //?????m?
				{
					if (a[i] != 0) //??????????
					{
					  t = t + 1; //??????
					  i = i + 1; //??????
					}
					else
					{
						i = i + 1;
					}
					if (i > n)
					{
						i = i - n; //?????????
					}
				}
				if (i == 1)
				{
					a[n] = 0;
				}
				else
				{
					a[i - 1] = 0; //?m??????
				}
		   }
		   for (k = 1;k <= n;k++)
		   {
			   if (a[k] != 0)
			   {
				   System.out.print(k);
				   System.out.print("\n");
			   break;
			   }
		   }
		}
		return 0;
	}
}

