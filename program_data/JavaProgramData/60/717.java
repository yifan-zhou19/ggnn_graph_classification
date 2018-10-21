package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sushu = new int(int n,int a[10000]);
		int n;
		int i;
		int[] array = new int[10000];
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = sushu(n, array);
		for (i = 0,p = 0;i < m;i++)
		{
			if (array[i] == array[i + 1] - 2)
			{
				System.out.printf("%d %d\n",array[i],array[i + 1]);
				p++;
			}
		}
		if (p == 0)
		{
			System.out.print("empty\n");
		}
	}
	public static int sushu(int n, int[] a)
	{
		int i;
		int j;
		int number = 0;
		for (i = 3;i <= n;i = i + 2)
		{
			for (j = 3;j <= Math.sqrt(i);j = j + 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i))
			{
				number = number + 1;
				a[number] = i;
			}
		}
		return (number++);
	}
}

