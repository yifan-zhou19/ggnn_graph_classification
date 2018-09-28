package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[N]);
		char[][] a = new char[N - 2][6];
		String t = new String(new char[6]);
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] b = new int[N - 2];
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
		for (i = 0;i < l;i++)
		{
			b[i] = 0;
		}
		a[0] = s.substring(0, n);
		t = tangible.StringFunctions.changeCharacter(t, n, a[0][n] = 0);
		b[0]++;
		for (i = 1;i <= l - n;i++)
		{
			t = s.substring(i, i + n);
			for (j = 0;b[j] != 0;j++)
			{
				if (strcmp(a[j],t) == 0)
				{
					b[j]++;
					break;
				}
			}
			if (b[j] == 0)
			{
				a[j] = t;
				b[j]++;
			}
		}
		for (k = i = 0;b[i] != 0;i++)
		{
			if (b[i] > k)
			{
				k = b[i];
			}
		}
		if (k == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",k);
			for (i = 0;b[i] != 0;i++)
			{
				if (b[i] == k)
				{
					System.out.printf("%s\n",a[i]);
				}
			}
		}
	}
}

