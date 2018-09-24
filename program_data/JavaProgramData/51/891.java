package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[600]);
		int n;
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		int[] a = new int[500];
		int max = 0;
		int k;
		for (i = 0;i < l;i++)
		{

			for (j = 1 + i;j < l;j++)
			{

				for (k = 0;k < n;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						break;
					}
				}
				if (k == n)
				{
					a[i]++;

				}
			}

		}

		for (i = 0;i < l;i++)
		{
			if (a[i] > max)
			{
				k = i;
				max = a[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else


		{
		System.out.printf("%d\n",a[k] + 1);
		for (j = 0;j < l;j++)
		{
			if (a[j] == max)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",s.charAt(j + k));
				}
				System.out.print("\n");
			}
		}
		}

	}

}

