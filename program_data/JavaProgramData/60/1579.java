package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int j;
		int i;
		int c;
		int k;
		int l;
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		k = 0;
		if (a > 4)
		{
		  for (i = 3;i <= a;i++)
		  {
			c = 0;
						 for (j = 2;j < i;j++)
						 {
									 if (i % j == 0)
									 {
									 c = 1;
									 }
						 }
										 if (c == 0)
										 {
											 b[k] = i;
										 k++;
										 }
		  }
		for (i = 1;i < k;i++)
		{
			l = b[i] - b[i - 1];
		if (l == 2)
		{
		System.out.printf("%d %d\n",b[i - 1],b[i]);
		}

		}
		}
						else
						{
						System.out.print("empty");
						}
		System.in.read();
		  System.in.read();
			System.in.read();

	}
}

