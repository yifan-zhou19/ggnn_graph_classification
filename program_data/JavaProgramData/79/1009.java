package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[20];
		int[] m = new int[20];
		int k = 0;
		int hang;
		for (k = 0;;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			if (n[k] == 0)
			{
				hang = k;
				break;
			}
		}
		for (k = 0;k < hang;k++)
		{
		int i = 0;
		int jishu = 0;
		int ling = 0;
		int[] a = new int[300];
		for (i = 0;i < 300;i++)
		{
			if (i <= n[k])
			{
				a[i] = i;
			}
			else
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			if (a[i] != 0)
			{
				jishu++;
				if (jishu == m[k])
				{
					ling++;
					jishu = 0;
					a[i] = 0;
				}
			}
			if (i == n[k])
			{
				i = 0;
			}
			if (ling == (n[k] - 1))
			{
				break;
			}
		}
		for (i = 0;i <= n[k];i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
		}
		return 0;
	}
}

