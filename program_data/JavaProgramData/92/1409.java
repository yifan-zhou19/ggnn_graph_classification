package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	return *(int)b - (int)a; //???????????
	}
	public static int Main()
	{
	int n;
	int[] tian = new int[1005];
	int[] king = new int[1005];
	int tmax;
	int tmin;
	int kmax;
	int kmin;
	int i;
	int j;
	int s;
	while (scanf("%d", n), n > 0)
	{
	   s = 0;
	   for (i = 1;i <= n;i++)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   tian[i] = Integer.parseInt(tempVar);
	   }
	   }
	   qsort(tian + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
	   for (j = 1;j <= n;j++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   king[j] = Integer.parseInt(tempVar2);
	   }
	   }
	   qsort(king + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
	   tmax = 1;
	   tmin = n;
	   kmax = 1;
	   kmin = n;
	   for (i = 1;i <= n;i++)
	   {
	   if (tian[tmax] > king[kmax])
	   {
			   s++;
			   tmax++;
			   kmax++;
	   }
		else
		{
		if (tian[tmax] < king[kmax])
		{
		s--;
		tmin--;
		kmax++;
		}
		else
		{
		if (tian[tmin] > king[kmin])
		{
		s++;
		tmin--;
		kmin--;
		}
		else
		{
		if (tian[tmin] < king[kmin])
		{
		s--;
		tmin--;
		  kmax++;
		}
		else
		{
		if (tian[tmin] < king[kmax])
		{
		s--;
		tmin--;
		kmax++;
		}
		}
		}
		}
		}
	   }
	   System.out.printf("%d\n",s * 200);
	}
	return 0;
	}
}

