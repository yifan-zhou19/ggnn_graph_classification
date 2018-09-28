package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int M;

	public static int Main()
	{
		int i;
		int alive;
		int count;
		int[] x = new int[320];

		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				N = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			if (N == 0 && M == 0)
			{
				break;
			}
			alive = N;
			count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1; alive > 1 ;i = i % N + 1)
			{
				if (x[i] == 0)
				{
					count++;
					if (count == M)
					{
						x[i] = 1;
						alive--;
						count = 0;
					}
				}
			}
			for (i = 1; i <= N ;i++)
			{
			   if (x[i] == 0)
			   {
				   System.out.printf("%d\n",i);
			   }
			}
		}

		return 0;
	}
}

