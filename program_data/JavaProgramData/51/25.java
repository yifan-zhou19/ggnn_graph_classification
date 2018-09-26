package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int n;
		int k;
		int p = 1;
		int x = 0;
		int[] a = new int[400];
			for (i = 0;i < 400;i++)
			{
				a[i] = 1;
			}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		int len = str.length();
		for (i = 0;i < len - n;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				int p = i;
				int t = j;
				int flag = 1;
				for (k = 0;k < n;k++)
				{
					if (str.charAt(t) != str.charAt(p))
					{
						flag = 0;
						break;
					}
					p++;
					t++;
				}
				if (flag == 1)
				{
					a[x] = a[x] + 1;
				}
			}
			x++;
		}
		for (i = 0;i < x - 2;i++)
		{
			if (a[i] != 1)
			{
				p = 0;
			}
		}
		if (p == 1)
		{
			System.out.print("NO");
		}
		else
		{
			int max = 0;
			for (i = 1;i < x;i++)
			{
				if (a[i] > a[max])
				{
					max = i;
				}
			}
			   System.out.printf("%d\n",a[max]);
			for (i = max;i < x - 1;i++)
			{
				if (a[i] == a[max])
				{
					for (j = i;j <= i + n - 1;j++)
					{
						System.out.printf("%c",str.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

