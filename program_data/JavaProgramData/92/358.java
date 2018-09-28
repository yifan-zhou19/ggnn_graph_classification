package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int e;
		int total;
		int sum;
		int afast;
		int bfast;
		int aslow;
		int bslow;
			 int[] a = new int[1000];
			 int[] b = new int[1000];
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
					 a[i] = Integer.parseInt(tempVar2);
				 }
			 }
		  for (i = 0;i < n;i++)
		  {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 b[i] = Integer.parseInt(tempVar3);
				 }
		  }
		  for (k = 1;k < n;k++)
		  {
				 for (i = 0;i < n - k;i++)
				 {
				   if (a[i] <= a[i + 1])
				   {
					 e = a[i + 1];
					 a[i + 1] = a[i];
					 a[i] = e;
				   }
				   if (b[i] <= b[i + 1])
				   {
					 e = b[i + 1];
					 b[i + 1] = b[i];
					 b[i] = e;
				   }
				 }
		  }
			sum = 0;
			total = 0;
			afast = 0;
			bfast = 0;
			aslow = n - 1;
			bslow = n - 1;
			for (;;)
			{
				  if (a[aslow] > b[bslow])
				  {
					sum += 200;
						 total++;
					aslow--;
					bslow--;
				  }
				  else if (a[aslow] < b[bslow])
				  {
					 sum -= 200;
					total++;
				aslow--;
				bfast++;
				  }
				 else if (a[aslow] == b[bslow])
				 {
					 if (a[afast] > b[bfast])
					 {
				   sum += 200;
							 total++;
						afast++;
						bfast++;
					 }
				else if (a[afast] < b[bfast])
				{
				   sum -= 200;
						total++;
				   aslow--;
				   bfast++;
				}
					else if (a[aslow] == b[bfast])
					{
				   sum += 0;
				   total++;
				   aslow--;
				   bfast++;
					}
						 else if (a[aslow] < b[bfast])
						 {
				   sum -= 200;
				   total++;
				   aslow--;
				   bfast++;
						 }
				 }
			if (total == n)
			{
			 break;
			}
			}
			System.out.printf("%d\n",sum);
		}
	 return 0;
	}
}

