package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[n][100];
		char[][] s = new char[n][100];
		String r = new String(new char[100]);
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		}
		for (int j = 0;j < n;j++)
		{
				if (b[j] >= 60)
				{
							c[m] = b[j],strcpy(s[m],a[j]);
							if (m != 0)
							{
							for (int k = m;k > 0;k = k - 1)
							{
									if (c[k] > c[k - 1])
									{
												 r = s[k],strcpy(s[k],s[k - 1]),strcpy(s[k - 1],r);
												 t = c[k],c[k] = c[k - 1],c[k - 1] = t;
									}
							}
							}
							m++;
				}
		}
		if (m != 0)
		{
		for (int i = 0;i < m;i++)
		{
		System.out.printf("%s\n",s[i]);
		}
		}
		for (int j = 0;j < n;j++)
		{
				if (b[j] < 60)
				{
				System.out.printf("%s\n",a[j]);
				}
		}
		System.in.read();
		System.in.read();
	}

}

