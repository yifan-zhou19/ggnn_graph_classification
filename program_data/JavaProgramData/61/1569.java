package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int a = 1;
		int b = 1;
		int j;
		int r;
		if (n == 1)
		{
			r = 1;
		}
		if (n == 2)
		{
			r = 1;
		}
		for (j = 2;j < n;j++)
		{

			r = a + b;
			a = b;
			b = r;

		}
		return r;
	}

	public static int Main()
	{
		int a;
		int[] n = new int[20];
		int r = 0;
		int[] m = new int[20];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			m[i] = F(n[i]);
			System.out.printf("%d\n",m[i]);
		}
		return 0;
	}




}

