package <missing>;

public class GlobalMembers
{
	public static int[] qw = new int[MAX];
	public static int[] tj = new int[MAX];
	public static int n;
	public static int cmp(Object a, Object b)
	{
		return *((int)b) - (int)a;
	}
	public static int Main()
	{
	  for (scanf("%d",n);n != 0;scanf("%d",n))
	  {
		  for (int i = 0;i < n;i++)
		  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			tj[i] = Integer.parseInt(tempVar);
		}
		  }
		  for (int i = 0;i < n;i++)
		  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			qw[i] = Integer.parseInt(tempVar2);
		}
		  }
		  qsort(qw,n,(Integer.SIZE / Byte.SIZE),cmp);
		  qsort(tj,n,(Integer.SIZE / Byte.SIZE),cmp);
		  int tjs;
		  int tje = n - 1;
		  int qws = 0;
		  int qwe = n - 1;
		  for (tjs = 0;qw[qws] > tj[tjs];tje--,qws++)
		  {
			  ;
		  }
		  int win = 0;
		  int lose = qws;
		  for (;tjs <= tje;)
		  {
		  if (tj[tjs] > qw[qws])
		  {
			win++,tjs++,qws++;
		  }
		  else if (tj[tjs] < qw[qws])
		  {
			lose++,tje--,qws++;
		  }
		  else
		  {
			  if (tj[tje] > qw[qwe])
			  {
			win++,tje--,qwe--;
			  }
			  else
			  {
			  if (tj[tje] < qw[qws])
			  {
				lose++,tje--,qws++;
			  }
			  else //draw
			  {
				tje--,qws++;
			  }
			  }

		  }
		  }
		  System.out.printf("%d\n",(win - lose) * 200);
	  }
	}

}

