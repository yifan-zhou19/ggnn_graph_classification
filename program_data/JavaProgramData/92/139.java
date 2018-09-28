package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{

		int x;
		int y;
		x = (int)a;
		y = (int)b;
		if (x < y)
		{
			  return 1;
		}
		else if (x > y)
		{
			  return -1;
		}
			else
			{
				return 0;
			}
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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			  for (i = 0;i < n;i++)
			  {
					t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  for (i = 0;i < n;i++)
			  {
					q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  qsort(t,n,(Integer.SIZE / Byte.SIZE),compare);
			  qsort(q,n,(Integer.SIZE / Byte.SIZE),compare);
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
			  System.out.print(s);
			  System.out.print("\n");
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
		}
		return 0;
	}

}

