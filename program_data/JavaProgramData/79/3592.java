package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[301];
		int x;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m, (n != 0) && (m != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) //????????//
		{
			a[0] = 0;
			for (i = 1;i <= n;i++) //???????????????1//
			{
				a[i] = 1;
			}
			for (x = 1,i = 0;i < n - 1;i++) //????n-1????????n-1?//
			{
				for (j = 0;j < m;x++)
				{
					if (x > n)
					{
						x = x % n; //??x??n//
					}
					if (a[x] == 1)
					{
						j++; //???????1???j?1.j??????????????m?????????//
					}
				}
				a[x - 1] = 0; //????????//
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] == 1)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

