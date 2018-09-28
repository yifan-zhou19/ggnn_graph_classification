package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p1=(int *)a;
		int p1 = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p2=(int *)b;
		int p2 = (int)b;
		return (p2) - p1;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1001];
		int[] b = new int[1001];
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
				for (int i = 0;i < n;i++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a + i = tempVar2;
				}
				}
				for (int i = 0;i < n;i++)
				{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b + i = tempVar3;
				}
				}

				qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
				qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
				//for(int i=0;i<n;i++)
			   // printf("%d ",a[i]);
			   // printf("\n\n");
				int sum = 0;
				int i = 0;
				int j = 0;
				int p = n - 1;
				int q = n - 1;
				while (i <= p != 0 && j <= q)
				{
				   if (a[i] > b[j])
				   {
					  i++;
					  j++;
					  sum += 200;
				   }
				   else if (a[i] < b[j])
				   {
						j++;
						p--;
						sum -= 200;
				   }
				   else
				   {
					   if (a[p] > b[q])
					   {
						  p--;
						  q--;
						  sum += 200;
					   }
					   else
					   {
						   if (a[p] < b[j])
						   {
							  p--;
							  j++;
							  sum -= 200;
						   }
						   else
						   {
							   p--;
							   j++;
						   }

					   }
				   }
				}
				System.out.printf("%d\n",sum);
		}

		return 0;
	}

}

