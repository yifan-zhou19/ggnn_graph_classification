package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int N;
	   int i;
	   int A;
	   int B;
	   int[] a = new int[1000000];
	   int[] b = new int[1000000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   N = Integer.parseInt(tempVar);
	   }
	   int[] c = new int[N];
	   for (i = 0;i < N;i++)
	   {
		   c[i] = N;
	   }
	   i = 0;
	   while (scanf("%d %d", A, B) && ((A * A + B * B) != 0))
	   {
		  c[A] = 0;
		  a[i] = A;
		  b[i] = B;
		  i++;
	   }

	   for (i;i > 0;i--)
	   {
		c[b[i - 1]]--;
	   }
		int k = 0;
		for (i = 0;i < N;i++)
		{
		if (c[i] == 1)
		{
		System.out.printf("%d",i);
		}
		 else
		 {
		 k++;
		 }
		}
		if (k == N)
		{
		System.out.print("NOT FOUND");
		}


		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

