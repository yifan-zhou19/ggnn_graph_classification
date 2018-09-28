package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
	   int i;
	   int j;
	   int k;
	   int temp;
	   for (i = 0;i < n - 1;i++)
	   {
		 k = i;
		 for (j = i + 1;j < n;j++)
		 {
			 if (a[j] > a[k])
			 {
				 k = j;
			 }
		 }
			 if (k != i)
			 {
			 temp = a[i];
			 a[i] = a[k];
			 a[k] = temp;
			 }

	   }

	}

	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int head;
	  int ans;
	  int tailt;
	  int tailk;
	  int m;
	  int[] t = new int[1005];
	  int[] k = new int[1005];
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
			  k[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  sort(t, n);
	  sort(k, n);
	  head = 0;
	  ans = 0;
	  tailt = n - 1;
	  tailk = n - 1;
	  for (i = 0;i < n;i++)
	  {
				if (t[head] > k[i])
				{
					head++;
					ans += 200;
				}
				else if (t[head] < k[i])
				{
					tailt--;
					ans -= 200;
				}
				else if (t[head] == k[i])
				{
					for (j = tailt,m = tailk;j >= head;j--,m--)
					{
						if (t[j] > k[m])
						{
							ans += 200;
							tailt--;
							tailk--;
						}
						else
						{
							   if (t[j] < k[i])
							   {
								   ans -= 200;
							   }
							  tailt = --j;
							  tailk = m;
							  break;
						}
					}
				}

				if (head > tailt)
				{
					break;
				}
	  }

	   System.out.printf("%d\n",ans);


	  }
	}
}

