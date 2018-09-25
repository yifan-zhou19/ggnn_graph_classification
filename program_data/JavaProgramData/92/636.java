package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		 int i;
		 int j;
		 int k;
		 int t;
		 for (i = 0;i < n - 1;i++)
		 {
			  k = i;
			  for (j = i + 1;j < n;j++)
			  {
				   if (a[j] > a[k])
				   {
						k = j;
				   }
				   else if (a[j] == a[k])
				   {
						continue;
				   }
			  }
			  t = a[k];
			  a[k] = a[i];
			  a[i] = t;
		 }
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int t;
		  int money;
		  int r;
		  int qwf;
		  int qws;
		  int tjf;
		  int tjs;
		  int win = 0;
		  int lose = 0;
		  int[] tj = new int[1001];
		  int[] qw = new int[1001];
		  for (r = 0;;r++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n == 0)
		  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto label;
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  tj[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  qw[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  sort(tj, n);
		  sort(qw, n);
		  qwf = 0;
		  qws = n - 1;
		  tjf = 0;
		  tjs = n - 1;
		  for (i = 0;i < n;i++)
		  {
			  if (tj[tjf] > qw[qwf])
			  {
				   win++;
				   tjf++;
				   qwf++;
			  }
			  else if (tj[tjs] > qw[qws])
			  {
				   win++;
				   tjs--;
				   qws--;
			  }
			  else
			  {
				   if (tj[tjs] != qw[qwf])
				   {
					   lose++;
				   }
				   qwf++;
				   tjs--;
			  }
		  }
		  money = (win - lose) * 200;
		  System.out.printf("%d\n",money);
		  win = 0;
		  lose = 0;
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  label:
		  ;

	}

}

