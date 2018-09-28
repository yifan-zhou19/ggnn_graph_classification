package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int m;
		int m1;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (k = 1;k <= n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			for (i = 0;str1.charAt(i) != '\0';i++)
			{
				;
			}
			m = i;
			for (i = 1;i <= m;i++)
			{
				a[i] = str1.charAt(m - i) - 48;
			}
			for (i = 0;str2.charAt(i) != '\0';i++)
			{
				;
			}
			m1 = i;
			for (i = 1;i <= m1;i++)
			{
				b[i] = str2.charAt(m1 - i) - 48;
			}
			for (i = 1;i <= m;i++)
			{
				if (a[i] < b[i])
				{
					c[i] = a[i] - b[i] + 10,a[i + 1] = a[i + 1] - 1;
				}
				else
				{
					c[i] = a[i] - b[i];
				}
			}

			if (c[m] == 0)
			{
				for (i = m - 1;i > 0;i--)
				{
					System.out.printf("%d",c[i]);
				}
			}
			else
			{
				for (i = m;i > 0;i--)
				{
					System.out.printf("%d",c[i]);
				}
			}
			System.out.print("\n");
			for (i = 1;i <= 100;i++)
			{
				b[i] = 0;
			}
		}

	}
}

