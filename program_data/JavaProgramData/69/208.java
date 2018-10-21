package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int l1;
		int l2;
		int i;
		int j;
		int p;
		int o;
		int l;
		long sum = 0;
		long k;
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
		int[] a = new int[500];
		int[] b = new int[500];
		int[] c = new int[1500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < l1;i++)
		{
			a[l1 - 1 - i] = s1.charAt(i) - 48;
		}
		for (i = 0;i < l2;i++)
		{
			b[l2 - 1 - i] = s2.charAt(i) - 48;
		}
		if (l1 > l2)
		{
			l = l1;
		}
		else
		{
			l = l2;
		}
		for (i = 0;i < l;i++)
		{
			c[i] += a[i] + b[i];
			if (c[i] >= 10)
			{
				c[i] = c[i] % 10;
				c[i + 1]++;
			}
		}

		while ((c[l] == 0) && (l > 1))
		{
			l--;
		}
		if (c[l] > 0)
		{
			l++;
		}
		for (i = l - 1;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}

			return 0;
	}

}

