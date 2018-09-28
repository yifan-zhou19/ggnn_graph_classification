package <missing>;

public class GlobalMembers
{
	public static int hui(int i)
	{
		int[] a = new int[20];
		int j;
		int k;
		for (j = 0;i != 0;j++)
		{
			 a[j] = i % 10;
			 i = i / 10;
		}
		for (k = 0;k < j / 2;k++)
		{
		if (a[k] != a[j - k - 1])
		{
		break;
		}
		}
		if (k == j / 2)
		{
		return 0;
		}
		else
		{
		return 1;
		}
	}
	public static int su(int i)
	{
		int j;
		for (j = 2;j < i;j++)
		{
		if (i % j == 0)
		{
		break;
		}
		}
		if (i == j)
		{
		return 0;
		}
		else
		{
		return 1;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int i = m;i <= n;i++)
		{
				if (hui(i) == 0)
				{
							 if (su(i) == 0)
							 {
										 s++;
										 if (s == 1)
										 {
										 System.out.printf("%d",i);
										 }
										 else
										 {
										 System.out.printf(",%d",i);
										 }
							 }
				}
		}
		if (s == 0)
		{
		System.out.print("no");
		}
		System.in.read();
		System.in.read();
	}


}

