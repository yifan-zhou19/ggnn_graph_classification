package <missing>;

public class GlobalMembers
{
	public static void minus(String a, String b)
	{
		int la;
		int lb;
		int i;
		int t;
		int j;
		int s;
		int c;
		int k = 0;
		la = a.length() - 1;
		lb = b.length() - 1;
		for (i = la - lb;i <= la;i++)
		{
			s = a[i];
			c = b[k];
			a[i] = s - c + 48;
			t = i;
			while (a[i].compareTo('0') < 0)
			{
				a[i] += 10;
				a[--i]--;
			}
			i = t;
			k++;
		}
		i = 0;
		while (a[i].equals('0'))
		{
			for (j = 0;j <= a.length();)
			{
				a[j] = a[++j];
			}
			i++;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[max][max];
		char[][] b = new char[max][max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			minus(a[i], b[i]);
			System.out.printf("%s\n",a[i]);
		}
	}

}

