package <missing>;

public class GlobalMembers
{
	public static int judge(int j,int n) //?judge????????j?n??j?0//
	{
	   if (j == n)
	   {
		   j = 0;
	   }
	   return j;
	}
	public static int choose(int n,int m)
	{
		int i;
		int j = 0;
		int k;
		int[] a = new int[301];
		for (k = 0;k < n - 1;k++) //??n-1??k?????????//
		{
		  for (i = 0;i < m;i++) //???????m???i????//
		  {
			for (;a[judge(j, n) + 1] != 0;)
			{
						 j = judge(j, n) + 1;
			}
						  j = judge(j, n) + 1;
		  }
		  a[j] = 1;
		}
		for (k = 1;a[k] != 0;)
		{
			k = judge(k, n) + 1;
		}
		return k;
	}

	public static int Main()
	{
	   int[] n = new int[100];
	   int[] m = new int[100];
	   int i;
	   int num;
	   for (i = 0;;i++)
	   {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		if (n[i] == 0)
		{
			break;
		}
	   }
	   num = i;
	   for (i = 0;i < num;i++)
	   {
		   System.out.printf("%d\n",choose(n[i], m[i]));
	   }
	   return 0;
	}




}

