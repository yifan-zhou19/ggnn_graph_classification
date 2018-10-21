public class xinxi
{
	public int sh;
	public String zz = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static xinxi[] a = tangible.Arrays.initializeWithDefaultxinxiInstances(1000);
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
		int[] b = new int[26];
		int m = 0;
		int k = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].sh = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].zz = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(a[i].zz).length();
			for (j = 0;j < l;j++)
			{
				b[a[i].zz.charAt(j) - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] > m)
			{
			m = b[i];
			k = i;
			}
		}
			c = k + 65;
			System.out.printf("%c\n%d\n",c,m);
			for (i = 0;i < n;i++)
			{
			l = String.valueOf(a[i].zz).length();
			for (j = 0;j < l;j++)
			{
				if (a[i].zz.charAt(j) == c)
				{
					System.out.printf("%d\n",a[i].sh);
				}
			}
			}
	}
}

