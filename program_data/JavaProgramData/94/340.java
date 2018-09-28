package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int n;
	 int[] sz = new int[500];
	 int i;
	 int e;
	 int c;
	 int t = 0;
	 int N;
	 int k = 0;
	 int[] J = new int[500];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 N = n;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 sz[i] = Integer.parseInt(tempVar2);
		 }
	 }

	 for (i = 0;i < N;i++)
	 {
	 c = sz[i] % 2;
	 if (c != 0)
	 {
		 J[t] = sz[i];
	  t++;
	 }
	 if (c == 0)
	 {
		J[t] = 0;
	  t++;
	  k++;
	 }
	 }

	 while (n > 0)
	 {
	 for (t = 0;t < n - 1;t++)
	 {
	  if (J[t] > J[t + 1])
	  {
			e = J[t + 1];
		 J[t + 1] = J[t];
		 J[t] = e;
	  }
	 }
	 n--;
	 }
	  System.out.printf("%d",J[k]);
	  for (t = k + 1;t < N;t++)
	  {
		 System.out.printf(",%d",J[t]);
	  }

	return 0;
	 }
}

