package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t;
		int[] a = new int[300];
		int[] b = new int[300];
		int N;
		int M;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				N = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			if (N == 0 && M == 0)
			{
				break;
			}
			for (i = 1;i <= N;i++)
			{
				b[i] = i;
				a[i] = i;
			}
			for (;N > 1;)
			{
				 for (i = 1;i <= N;i++)
				 {
					 b[i] = a[i];
				 }
				 t = M % N;
				 N--;
				 for (j = 1;j <= N;j++)
				 {
					if (t + j <= N + 1)
					{
						a[j] = b[t + j];
					}
					if (t + j > N + 1)
					{
						a[j] = b[t + j - N - 1];
					}
				 }
			}
			   System.out.printf("%d\n",a[1]);

		}while (N != 0 && M != 0);
	}
}

