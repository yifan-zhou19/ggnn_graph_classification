package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] b = new int[101];
		int[] b1 = new int[101];
		int t;
		int h;
		int k;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] a1 =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String s1 = new String(new char[11]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,h = 0,k = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			if (t >= 60)
			{
				b[h] = t;
				a[h] = s1;
				h++;
			}
			else
			{
				b1[k] = t;
				a1[k] = s1;
				k++;
			}
		}

		for (i = 0;i <= h - 2;i++)
		{
			for (j = 0;j <= h - 2 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					s1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = s1;
				}
			}
		}
		for (i = 0;i <= h - 1;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf("%s\n",a1[i]);
		}
	}





}

