package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int t;
		  int n;
		  int m;
		  int sum;
		  int head;
		  int taila;
		  int tailb;
		  int max = 1000;
		  int[] a = new int[max];
		  int[] b = new int[max];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
			  for (i = 0;i <= n - 1;i++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
			  }
			  for (i = 0;i <= n - 1;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
			  }
			  for (j = 0;j < n - 1;j++)
			  {
				  for (i = 0;i < n - 1 - j;i++)
				  {
					  if (a[i] < a[i + 1])
					  {
						  t = a[i];
						  a[i] = a[i + 1];
						  a[i + 1] = t;
					  }
				  }
			  }
			  for (j = 0;j < n - 1;j++)
			  {
				  for (i = 0;i < n - 1 - j;i++)
				  {
					  if (b[i] < b[i + 1])
					  {
						  t = b[i];
						  b[i] = b[i + 1];
						  b[i + 1] = t;
					  }
				  }
			  }
			  sum = 0;
			  head = 0;
			  taila = n - 1;
			  tailb = n - 1;
			  for (i = 0;i < n;i++)
			  {
				  if (a[head] > b[i])
				  {
					  head++;
					  sum += 200;
				  }
				  else if (a[head] < b[i])
				  {
					  taila--;
					  sum -= 200;
				  }
				  else if (a[head] == b[i])
				  {
					  for (j = taila,m = tailb;j >= head;j--,m--)
					  {
						  if (a[j] > b[m])
						  {
							  sum += 200;
							  taila--;
							  tailb--;
						  }
						  else
						  {
							  if (a[j] < b[i])
							  {
								  sum -= 200;
							  }
							  taila = --j;
							  tailb = m;
							  break;
						  }
					  }
				  }
				  if (head > taila)
				  {
					  break;
				  }
			  }
			  System.out.printf("%d\n",sum);
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  n = Integer.parseInt(tempVar4);
			  }
		  }
		  System.in.read();
		  System.in.read();
	}
}

