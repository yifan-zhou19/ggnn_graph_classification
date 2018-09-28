package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int[] a = new int[300000];
	  int[] n = new int[1000];
	  int[] m = new int[1000];
	  int[] answer = new int[1000];
	  int k = 0;
	  int i;
	  int j;
	  int l;
	  int x = 0;
	  int t;
	  while (x == 0)
	  {
		  k++;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n[k] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m[k] = Integer.parseInt(tempVar2);
		  }
		  if (n[k] == 0 && m[k] == 0)
		  {
			  x = 1;
		  }
	  }
	  for (i = 1;i <= k - 1;i++)
	  {
		  for (t = 1;t <= 300;t++)
		  {
			  a[t] = t;
		  }
		  j = 1;
		  l = n[i] + 1;
		  while (j < l - 1)
		  {
			  if (j % m[i] == 0)
			  {
				  j++;
			  }
			  else
			  {
				  a[l] = a[j];
				  j++;
				  l++;
			  }
		  }
		  answer[i] = a[j];
	  }
	  for (i = 1;i <= k - 1;i++)
	  {
		  System.out.printf("%d\n",answer[i]);
	  }
	}

}

