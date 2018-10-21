package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int number = 1;
		 int[] primes = new int[100000];
		 int i;
		 int j;
		 primes[0] = 2;
		 for (i = 3; i <= n; i = i + 2)
		 {
			  for (j = 0; primes[j] * primes[j] < i; j++)
			  {
				 if (i % primes[j] == 0)
				 {
					 break;
				 }
			  }
			 if (primes[j] * primes[j] > i)
			 {
				 primes[number] = i;
				 number++;
			 }
		 }
		 int k;
		 int l;
		 int m;
		 int p;
		 for (k = 6;k <= n;k = k + 2)
		 {
			 for (l = 0;primes[l] <= k / 2;l++)
			 {
				 m = k - primes[l];
				 for (p = 0;primes[p] * primes[p] < k;p++)
				 {
					 if (m % primes[p] == 0)
					 {
						 break;
					 }
				 }
				 if (primes[p] * primes[p] > k)
				 {
					 System.out.printf("%d=%d+%d\n",k,primes[l],m);
					 break;
				 }
			 }
		 }
		 return 0;
	 }
}

