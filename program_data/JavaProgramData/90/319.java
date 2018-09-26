// ?????? ???1000010500 
// ????? 
// 2010-12-3


int ways = new int(int,int);

int main()
{
	int t;
	int M;
	int N;
	int i;
	int[] k = new int[100];
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < t;i++)
	{
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k[i] = ways(M,N); // ?k??????
	}
	for (i = 0;i < t;i++)
	{
		 System.out.print(k[i]);
		 System.out.print("\n");
	}
	return 0;
}

int ways(int m,int n)
{
	int k;
	if (n == 1 || m == 0 || m == 1) // ???????????????????
	{
	   return 1;
	}
	if (m >= n) // ?m=n???0?n??????
	{
		  k = ways(m,n - 1) + ways(m - n,n);
	}
	else
	{
		  k = ways(m,n - 1);
	}
	return k;
}








