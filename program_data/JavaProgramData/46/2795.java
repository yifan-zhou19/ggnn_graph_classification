package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int t;
		int n;
		t = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}


		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}

		int c0 = c;
		int r0 = r;
		int i0 = 0;
		int j0 = 0;

		while (true)
		{
			System.out.printf("%d",a[i0][j0]);
			t++;

			if (t == r * c)
			{
				break;
			}
			i = i0;
			for (j = j0 + 1;j < j0 + c0;j++)
			{
				System.out.printf("\n%d",a[i][j]);
				t++;
			}
			if (t == r * c)
			{
				break;
			}
			r0--;
			j--;
			for (i = i + 1;i < i0 + r0 + 1;i++)
			{
				System.out.printf("\n%d",a[i][j]);
				t++;
			}

			if (t == r * c)
			{
				break;
			}
			c0--;
			i--;

			for (j = j - 1;j >= j0;j--)
			{
				System.out.printf("\n%d",a[i][j]);
				t++;
			}

			if (t == r * c)
			{
				break;
			}
			r0--;
			j++;
			for (i = i - 1;i > i0;i--)
			{
				System.out.printf("\n%d",a[i][j]);
				t++;
			}
			if (t == r * c)
			{
				break;
			}
			else
			{
				System.out.print("\n");
			}
			c0--;
			i0 = i + 1;
			j0++;
		}
		return 0;
	}

}

