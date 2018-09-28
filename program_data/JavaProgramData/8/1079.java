package <missing>;

public class GlobalMembers
{
	public static void rank(int n,int c)
	{
		int[] num = new int[10];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				int a;
				if (num[j] > num[j + 1])
				{
					a = num[j];
					num[j] = num[j + 1];
					num[j + 1] = a;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",num[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
		if (c != 2)
		{
			System.out.print(" ");
		}
	}
	public static void count()
	{
		int[] b = new int[2];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[1] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= 2;i++)
		{
			rank(b[i - 1], i);
		}
	}
	public static int Main()
	{
		void rank(int n,int c);
		void count();
		count();
		return 0;
	}




}

