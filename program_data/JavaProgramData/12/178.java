package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[15];
		int[] b = new int[20];
		int i;
		int l;
		int j;
		int n;
		int p = 0;
		int num = 0;
		while (true)
		{
			num = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == -1)
			{
				break;
			}
			else
			{
				a[0] = n;
			for (l = 1;;l++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[l] = Integer.parseInt(tempVar2);
				}
				if (a[l] == 0)
				{
					break;
				}
			}
			for (i = 0;a[i] != 0;i++)
			{
				for (j = 0;a[j] != 0;j++)
				{
				  if (a[i] == a[j] * 2)
				  {
					  num++;
				  }
				}
			}
			b[p] = num;
			p++;
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}
}

