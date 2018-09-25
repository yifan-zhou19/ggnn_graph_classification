package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] s = {"\0"};
		char c;
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[26];
		int[] b = new int[100];
		int t = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
			for (c = 'A';c <= 'Z';c++)
			{
				if (tangible.StringFunctions.strChr(s[i],c))
				{
					a[c - 65]++;
				}
			}
		}
		j = a[0];
		k = 0;
		for (i = 1;i < 26;i++)
		{
			if (a[i] > j)
			{
				j = a[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",k + 65,a[k]);
		for (i = 0;i < m;i++)
		{
				if (tangible.StringFunctions.strChr(s[i],k + 65))
				{
					System.out.printf("%d\n",b[i]);
				}
		}
	}

}

