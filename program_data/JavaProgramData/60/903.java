package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c = 0;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] za = new int[n];
		for (i = 2;i <= n;i++)
		{
			b = 0;
			for (a = 2;a <= i - 1;a++)
			{
				if (i % a == 0)
				{
					b++;
				}
			}
			if (b == 0)
			{
				za[k] = i;
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			if (za[i + 1] - za[i] == 2)
			{
				c++;
				System.out.printf("%d %d\n",za[i],za[i + 1]);
			}
		}
		if (c == 0)
		{
			System.out.print("empty");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(za);
		return 0;
	}
}

