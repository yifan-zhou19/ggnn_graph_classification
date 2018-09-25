package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	 return *(int)a < (int)b ? 1 : -1;
	}
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int[] tian = new int[1005];
	 int[] king = new int[1005];
	 int tmax;
	 int kmax;
	 int tmin;
	 int kmin;
	 while ((n,n = ConsoleInput.readToWhiteSpace(true)).length() > 0)
	 {
	  for (i = 1;i <= n;i++)
	  {
	   tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  qsort(tian + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
	  for (j = 1;j <= n;j++)
	  {
	   king[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  qsort(king + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
	  int cnt = 0;
	  tmax = 1;
	  tmin = n;
	  kmax = 1;
	  kmin = n;
	  for (i = 1; i <= n; i++)
	  {
	   if (tian[tmax] > king[kmax])
	   {
		cnt++;
		tmax++;
		kmax++;
	   }
	   else if (tian[tmax] < king[kmax])
	   {
		cnt--;
		tmin--;
		kmax++;
	   }
	   else
	   {
					if (tian[tmin] > king[kmin])
					{
		 cnt++;
		 tmin--;
		 kmin--;
					}
		else if (tian[tmin] < king[kmin])
		{
		 cnt--;
		 tmin--;
		 kmax++;
		}
		else
		{
		 if (tian[tmin] < king[kmax])
		 {
		  cnt--;
		  tmin--;
		  kmax++;
		 }

		}
	   }

	  }
		System.out.print(cnt * 200);
		System.out.print("\n");
	 }
	 return 0;
	}

}

