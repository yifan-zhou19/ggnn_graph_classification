package <missing>;

public class GlobalMembers
{
	public static void Qsort(int[] a, int low, int up)
	{
		int i;
		int j;
		int k;
		int x;
		if (low >= up)
		{
			return;
		}
		else
		{
			k = a[low];
			j = low;
			for (i = low;i <= up;i++)
			{
				if (a[i] > k)
				{
					j++;
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		x = k;
		a[low] = a[j];
		a[j] = x;
		Qsort(a, low, j - 1);
		Qsort(a, j + 1, up);

	}

	public static int Main()
	{
		int[] n = new int[100];
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i; //w???????l???????d?????? ,q?????????s????????
		int j;
		int m;
		int w;
		int l;
		int d;
		int q1;
		int s1;
		int q2;
		int s2;
		int money;
		i = w = l = d = q1 = s1 = q2 = s2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		while (n[i] != 0)
		{
		  for (j = 0;j < n[i];j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[j] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (j = 0;j < n[i];j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[j] = Integer.parseInt(tempVar3);
			  }
		  }

	   // m=i;   //??????? ?????????

		//for(i=0;i<m;i++)
		Qsort(a, 0, n[i] - 1);
		Qsort(b, 0, n[i] - 1);
		   while ((w + l + d) != n[i])
		   {
			  if (a[n[i] - 1 - s1] > b[n[i] - 1 - s2])
			  {
				  w++;
				  s1++;
				  s2++;
			  }
			  else if (a[n[i] - 1 - s1] < b[n[i] - 1 - s2])
			  {
				  l++;
				  s1++;
				  q2++;
			  }
			  else if (a[q1] > b[q2])
			  {
				  w++;
				  q1++;
				  q2++;
			  }
			  else if (a[q1] < b[q2])
			  {
				  l++;
				  s1++;
				  q2++;
			  }
			  else if (a[q1] == b[q2])
			  {
				  if (a[n[i] - 1 - s1] < b[q2])
				  {
					  l++;
					  s1++;
					  q2++;
				  }
			   else
			   {
				   d++;
				   s1++;
				   q2++;
			   }
			  }
		   }
		   money = (w - l) * 200;
		   s1 = q1 = s2 = q2 = w = l = d = 0;
		   System.out.printf("%d\n",money);
		i++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n[i] = Integer.parseInt(tempVar4);
		}
		}

	}

}

