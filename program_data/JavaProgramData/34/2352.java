package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		a[0] = n;
		if (a[0] == 1)
		{
			System.out.print("End");
		}
		else
		{

		while (a[i] != 1)
		{
		if (a[i] % 2 == 0)
		{
			a[i + 1] = a[i] / 2;
			System.out.printf("%d/2=%d\n",a[i],a[i + 1]);
			if (a[i + 1] == 1)
			{
				break;
			}
		}
		else
		{
			a[i + 1] = a[i] * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a[i],a[i + 1]);
			if (a[i + 1] == 1)
			{
				break;
			}
		}
		i++;
		}
		System.out.print("End");
		}
		return 0;

	}



}

