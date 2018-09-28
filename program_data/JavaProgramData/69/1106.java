package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a >= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		String s1 = new String(new char[100000]);
		String s2 = new String(new char[1000000]);

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

		int len1 = 0;
		int len2 = 0;
		len1 = s1.length();
		len2 = s2.length();
		//????????
		int j = 0;
		for (int i = len1 - 1; i >= 0; i--, j++)
		{
			a[j] = s1.charAt(i) - '0'; //?s1????????a?????????????????
		}

		j = 0;
		for (int i = len2 - 1; i >= 0; i--, j++)
		{
			b[j] = s2.charAt(i) - '0';
		}

		int m = max(len1, len2);
		for (int i = 0; i < m; i++)
		{
			a[i] = a[i] + b[i];
			if (a[i] >= 10)
			{
				a[i] %= 10;
				a[i + 1]++;
			}
		}
		int tag = 0; //????0?
		for (int i = m; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				tag = 1;
			}
			if (tag == 1)
			{
				System.out.printf("%d",a[i]);
			}
			if (tag == 0 && i == 0)
			{
				System.out.print("0");
			}
		}
		System.out.print("\n");
		return 0;
	}

}

