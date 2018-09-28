package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (;;)
		{
			int n;
			int m;
			int[] a = new int[300];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
			break;
			}
			int i;
			int s;
			int t = 0;
			s = n;
			while (s != 1)
			{
			for (i = 0;i < n;i++)
			{
				if (a[i] == 0)
				{
				t++;
				}
				if (t == m)
				{
					a[i] = 1;
					s--;
					t = 0;
				}
				if (s == 1)
				{
					break;
				}
			}
			}
			for (i = 0;i < n;i++)
			{
			if (a[i] != 1)
			{
			break;
			}
			}
			System.out.printf("%d\n",i + 1);
		}

	}
}

