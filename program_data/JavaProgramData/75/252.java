package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i;
		int j;
		int len1;
		int len2;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		char e;
		char d;

		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				e = tempVar2.charAt(0);
			}
			if (e == '\n')
			{
				break;
			}
		}

		for (j = 1;;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				d = tempVar4.charAt(0);
			}
			if (d == '\n')
			{
				break;
			}
		}
		System.out.printf("%d ",i);
		m = i;

			for (j = 1;j < 1000;j++)
			{
				 for (i = 1;i <= m;i++)
				 {
					if (j >= a[i] != 0 && j < b[i])
					{
						c[j] = c[j] + 1;
					}
				 }
			}
			for (i = 1;i < 1000;i++)
			{
				if (c[1] < c[i])
				{
					c[1] = c[i];
				}
			}
			System.out.printf("%d",c[1]);
		return 0;
	}
}

