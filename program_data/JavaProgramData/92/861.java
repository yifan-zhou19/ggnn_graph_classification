void myrank(int *,int);

int[] kh = new int[1000];
int[] th = new int[1000];


 int main()
 {
	 int N;
	 int i;
	 int j;
	 int k;
	 int mxt;
	 int mxk;
	 int w;
	 while (scanf("%d", N), N)
	 {
		 for (i = 0; i < N; i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 th[i] = Integer.parseInt(tempVar);
			 }
		 }
		 myrank(th,N);
		 for (i = 0; i < N; i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 kh[i] = Integer.parseInt(tempVar2);
			 }
		 }
		 myrank(kh,N);
		 w = k = j = 0;
		 mxk = mxt = N - 1;
		 for (i = 0; i < N; i++)
		 {
			 if (th[j] > kh[k])
			 {
				 w++, j++, k++;
			 }
			 else if (th[mxt] > kh[mxk])
			 {
				 w++, mxt--, mxk--;
			 }
			 else if (th[mxt] < kh[k])
			 {
				 w--, mxt--, k++;
			 }
			 else
			 {
				 ;
			 }
		 }
		 System.out.printf("%d\n", 200 * w);
	 }
	 return 0;
 }

 void myrank(int * sz,int n)
 {
	int i;
	int j;
	int tem;
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			if (*(sz + i) < *(sz + j))
			{
				tem = (sz + i);
				*(sz + i) = *(sz + j);
				*(sz + j) = tem;
			}
		}
	}
 }

