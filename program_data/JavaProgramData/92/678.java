package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int c;
		  int d;
		  int e;
		  int f;
		  int g;
		  int h;
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  while (scanf("%d", c) && c != 0)
		  {
		  int[] a = new int[c];
		  int[] b = new int[c];
		  for (d = 0;d < c;d++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[d] = Integer.parseInt(tempVar);
		  }
		  }
		  for (d = 0;d < c;d++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[d] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (e = 0;e < c - 1;e++)
		  {
		  for (f = 0;f < c - 1;f++)
		  {
		  if (a[f] < a[f + 1])
		  {
		  g = a[f];
		  a[f] = a[f + 1];
		  a[f + 1] = g;
		  }
		  }
		  }
		  for (e = 0;e < c - 1;e++)
		  {
		  for (f = 0;f < c - 1;f++)
		  {
		  if (b[f] < b[f + 1])
		  {
		  g = b[f];
		  b[f] = b[f + 1];
		  b[f + 1] = g;
		  }
		  }
		  }
		  i = 0;
		  j = 0;
		  k = c - 1;
		  m = c - 1;
		  for (n = 0,h = 0;n < c;n++)
		  {
		  if (a[k] > b[m])
		  {
					   h++;
					   k--;
					   m--;
		  }
		  else if (a[k] < b[m])
		  {
					   h--;
					   k--;
					   j++;
		  }
		  else
		  {
			  if (a[i] > b[j])
			  {
						   h++;
						   i++;
						   j++;
			  }
			  else if (a[i] < b[j])
			  {
				   h--;
				   k--;
				   j++;
			  }
			  else
			  {
				  if (a[k] == b[j])
				  {
							   k--;
							   j++;
				  }
				  else
				  {
					  h--;
					  k--;
					  j++;
				  }
			  }
		  }
		  }
		  System.out.printf("%d\n",200 * h);
		  }
	}
}

