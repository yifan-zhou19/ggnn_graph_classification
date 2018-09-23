public class a
{
	public int n;
	public String s = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static a[] b = tangible.Arrays.initializeWithDefaultaInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] c = new int[26];
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int d;
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].s = tempVar3.charAt(0);
			}
			d = String.valueOf(b[i].s).length();
			for (m = 0;m < d;m++)
			{
				c[b[i].s.charAt(m) - 65] += 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
				for (j = i + 1;j < 26;j++)
				{
					if (c[j] > c[i])
					{
						break;
					}
				}
				if (j == 26)
				{
					break;
				}
		}
		t = 65 + i;
		System.out.printf("%c\n%d\n",t,c[i]);
		for (i = 0;i < n;i++)
		{
			if (tangible.StringFunctions.strChr(b[i].s,t) != null)
			{
				System.out.printf("%d\n",b[i].n);
			}
		}
		return 0;
	}
}

