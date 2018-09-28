package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (b = 0;b < 100;b++)
		{
			if (a[b] % 2 != 0 && a[b] != 1)
			{
				a[b + 1] = a[b] * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a[b],a[b + 1]);
			}
			else if (a[b] % 2 == 0)
			{
				a[b + 1] = a[b] / 2;
				System.out.printf("%d/2=%d\n",a[b],a[b + 1]);
			}
			else
			{
				System.out.print("End");

			break;
			}
		}

		return 0;
	}


}

