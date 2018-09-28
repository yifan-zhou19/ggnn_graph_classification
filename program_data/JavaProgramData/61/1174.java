package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[20];
		int number = 0;
		int e = 0;
		int f = 1;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				number = e + f;
				g = e;
				e = number;
				f = g;

			}
			System.out.printf("%d\n",number);
			number = 0;
			e = 0;
			f = 1;
		}
		return 0;
	}
}

