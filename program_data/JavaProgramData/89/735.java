package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int shuru = 0;
		int r = 0;
		int i;
		int j;
		int[] a = new int[100000];
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if ((a[i] == 0) && (b[i] == 0))
			{
				break;
			}
			else
			{
				shuru++;
			}
		}
		for (i = 0;i < shuru;i++)
		{
			r = 0;
			for (j = 1;j < shuru - i;j++)
			{
				if (b[i] == b[i + j])
				{
					r++;
				}
				if (r == n - 2)
				{
					System.out.printf("%d",b[i]);
					break;
				}
			}
			if (r == n - 2)
			{
				break;
			}

		}
		if (i == shuru)
		{
			System.out.print("NOT FOUND");
		}
	return 0;
	}
}

