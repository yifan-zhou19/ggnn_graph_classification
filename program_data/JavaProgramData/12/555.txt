package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[16];
		int s;
		int q;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		a[0] = q;
		if (q == -1)
		{
			break;
		}
		for (i = 1;i <= 15;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] == 0)
				{
					break;
				}
		}
		s = 0;
		for (j = 0;j < i;j++)
		{
				for (k = 0;k < i;k++)
				{
					if (a[j] == 2 * a[k])
					{
						s = s + 1;
					}
					else
					{
						s = s;
					}
				}
		}
			System.out.printf("%d\n",s);
		} while (q != -1);
	}

}

