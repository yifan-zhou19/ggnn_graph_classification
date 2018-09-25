package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		  int n;
		  int i;
		  int r;
		  int tk;
		  int tm;
		  int qk;
		  int qm;
		  int[] t = new int[1000];
		  int[] q = new int[1000];
		  for (;;)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
				  break;
			  }
			  for (i = 0;i < n;i++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  t + i = tempVar2;
				  }
			  }
			  for (i = 0;i < n;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  q + i = tempVar3;
				  }
			  }
			  qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
			  qsort(q,n,(Integer.SIZE / Byte.SIZE),cmp);
			  r = 0;
			  tk = 0;
			  tm = n - 1;
			  qk = 0;
			  qm = n - 1;
			  while (tk <= tm)
			  {
					   if (t[tm] > q[qm])
					   {
						   r++;
						   tm--;
						   qm--;
					   }
				  else if (t[tk] > q[qk])
				  {
					  r++;
					  tk++;
					  qk++;
				  }
				  else if (t[tm] < q[qk])
				  {
					  r--;
					  tm--,qk++;
				  }
				  else
				  {
					  tm--;
					  qk++;
				  }
			  }
			  System.out.printf("%d\n",200 * r);

		  }
	}
}

