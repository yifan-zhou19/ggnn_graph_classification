package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int c;
		int[] a = new int[1000];
		int[] b = new int[1000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			j = 0;
			c = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
				b[j] = k - a[i];
				j++;
			}
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (b[j] == a[i])
					{
						c++;
					}
				}
			}
			if (c != 0)
			{
				System.out.print("yes");
			}
			else
			{
						System.out.print("no");
			}

			return 0;
	}

}

