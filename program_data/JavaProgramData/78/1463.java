package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int z;
		int q;
		int s;
		int l1;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (j == i)
				{
					continue;
				}
				for (k = 1;k <= 5;k++)
				{
					if (k == j || k == i)
					{
						continue;
					}
					for (l1 = 1;l1 <= 5;l1++)
					{
						if (l1 == k || l1 == j || l1 == i)
						{
							continue; //??????????????????????
						}
						if ((i + j) == (k + l1) && (i + l1) > (k + j) && (i + k) < j)
						{
							z = i;
							q = j;
							s = k;
							l = l1; //?????????????????
						}
					}
				}
			}
		}
		char[] ch = {0, '\0', '\0', '\0'};
		ch[0] = 'z';
		ch[1] = 'q';
		ch[2] = 's';
		ch[3] = 'l';
		int[] a = new int[4];
		a[0] = z;
		a[1] = q;
		a[2] = s;
		a[3] = l; //???????????????????
		int x;
		int y;
		int t1;
		int t2;
		for (x = 0;x < 3;x++)
		{
			for (y = 0;y < 3 - x;y++)
			{
				if (a[y] < a[y + 1])
				{
					t1 = a[y];
					a[y] = a[y + 1];
					a[y + 1] = t1;
					t2 = ch[y];
					ch[y] = ch[y + 1];
					ch[y + 1] = t2;
				} //??????????????????
			}
		}
		for (i = 0;i < 4;i++)
		{
		System.out.print(ch[i]);
		System.out.print(" ");
		System.out.print(a[i] * 10);
		System.out.print('\n');
		System.out.print("\n");
		}
		return 0;
	}
}
