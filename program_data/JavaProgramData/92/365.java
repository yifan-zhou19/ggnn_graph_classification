package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int[] a = new int[1001];
		  int[] b = new int[1001];
		  int t;
		  while (true)
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
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (i = 1;i < n;i++)
		  {
			   for (j = i + 1;j <= n;j++)
			   {
					 if (a[i] > a[j])
					 {
						   t = a[i];
						   a[i] = a[j];
						   a[j] = t;
					 }
			   }
		  }
		  for (i = 1;i < n;i++)
		  {
			   for (j = i + 1;j <= n;j++)
			   {
					 if (b[i] > b[j])
					 {
						   t = b[i];
						   b[i] = b[j];
						   b[j] = t;
					 }
			   }
		  }
		  int tie = 0;
		  int win = 0;
		  int s;
		  j = 1;
		  for (i = 1;i <= n;i++)
		  {
			   if (a[i] > b[j])
			   {
				   ++j;
				   ++win;
			   }
			   else if (a[i] > b[j - 1] && tie > 0)
			   {
					--tie;
					++win;
			   }
			   else if (a[i] == b[j])
			   {
					++j;
					++tie;
			   }
		  }
		  s = win * 400 + tie * 200 - n * 200;
		  System.out.printf("%d\n",s);
		  }
	}
}

