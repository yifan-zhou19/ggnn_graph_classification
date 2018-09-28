package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object q1, Object q2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1=(int *)q1;
		int p1 = (int)q1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p2=(int *)q2;
		int p2 = (int)q2;
		return p1 - p2;
	}


	public static int[] t = new int[1000];
	public static int[] q = new int[1000];
	public static int n;

	public static int Main()
	{
		int i;
		int j;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				return 0;
			}
		for (i = 0;i < n;i++)
		{
			t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(t,n,(Integer.SIZE / Byte.SIZE),mycompare);
		qsort(q,n,(Integer.SIZE / Byte.SIZE),mycompare);
		int ans = 0;
		int tf = 0;
		int tl = n - 1;
		int qf = 0;
		int ql = n - 1;
		while (qf <= ql)
		{
		  if (t[tf] > q[qf])
		  {
			  ans++;
			  tf++;
			  qf++;
		  }
		  else if (t[tl] > q[ql])
		  {
			  ans++;
			  tl--;
			  ql--;
		  }
		  else
		  {
			  if (t[tf] > q[ql])
			  {
				ans++;
			  }
			  else if (t[tf] < q[ql])
			  {
				  ans--;
			  }
			  tf++;
			  ql--;
		  }
		}
		System.out.print(ans * 200);
		System.out.print("\n");
		}
		return 0;
	}


}

