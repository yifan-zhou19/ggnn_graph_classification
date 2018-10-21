package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	int i;
	int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		a[1] = n;
		if (n != 1)
		{
		for (i = 1;a[i] != 1;i++)

		{
		if (a[i] % 2 == 0)


		{
		a[i + 1] = a[i] / 2;
		System.out.printf("%d/2=%d\n",a[i],a[i + 1]);
		}
		if (a[i] % 2 == 1)
		{
				a[i + 1] = a[i] * 3 + 1;
		System.out.printf("%d*3+1=%d\n",a[i],a[i + 1]);
		}
		}
		System.out.print("End");
		}
		if (n == 1)
		{
		System.out.print("End");
		}
	}

}

