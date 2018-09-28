package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		  int n;
		  int[] t = new int[1000];
		  int[] q = new int[1000];
		  int i;
		  int j;
		  int k;
		  int m;
		  int r;
		  int tk;
		  int tm;
		  int qk;
		  int qm;
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
							  t[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  q[i] = Integer.parseInt(tempVar3);
						  }
		  }

		  qsort(t,n,(Integer.SIZE / Byte.SIZE),compare);
		  qsort(q,n,(Integer.SIZE / Byte.SIZE),compare);
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
						  tm--;
						  qk++;
						}
					  else
					  {
						  break;
					  }
		 }

	System.out.printf("%d\n",r * 200);
		  }

	}

}

