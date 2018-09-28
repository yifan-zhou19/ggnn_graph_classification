package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		int x;
		int y;
		x = (int)a;
		y = (int)b;
	   return y - x;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int s;
		int x;
		int n;
		int[] t = new int[1000];
		int[] q = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
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
			  qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
			  qsort(q,n,(Integer.SIZE / Byte.SIZE),cmp);

			  for (i = 0;t[0] < q[i] && i < n;i++)
			  {
				  ;
			  }
				  for (s = -200 * n;i < n;i++)
				  {
					 x = -i * 200;
					 for (j = i,k = 0;j < n;j++,k++)
					 {
						  if (t[k] > q[j])
						  {
								x += 200;
						  }
						  else if (t[k] < q[j])
						  {
								x -= 200;
						  }
					 }
					 if (x > s)
					 {
						  s = x;
					 }
				  }
			  System.out.printf("%d\n",s);
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  n = Integer.parseInt(tempVar4);
			  }
		}
		return 0;
	}

}

