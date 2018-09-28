package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = new int(int a[],int n);
		String a = new String(new char[500]);
		int[] b = new int[500];
		int n;
		int i;
		int j;
		int k;
		int p;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		/*printf("%d",strlen(a));*/
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = i;j <= a.length() - n;j++)
			{
				p = 1;
				for (k = 0;k < n;k++)
				{
					if (a.charAt(i + k) == a.charAt(j + k))
					{
						p = p * 1;
					}
					else
					{
						p = p * 0;
					}
				}
				if (p == 1)
				{
					b[i]++;
				}
			}
		}
		t = max(b, a.length() - n + 1);

		if (t == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",t);
			for (i = 0;i <= a.length() - n;i++)
			{
			if (b[i] == t)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",a.charAt(i + j));
				}
				System.out.print("\n");
			}
			}
		}
		return 0;
	}

	public static int max(int[] a, int n)
	{
		int t = a[0];
		int i;
		for (i = 0;i < n;i++)
		{
			if (t < a[i])
			{
				t = a[i];
			}
		}
		return t;
	}
}

