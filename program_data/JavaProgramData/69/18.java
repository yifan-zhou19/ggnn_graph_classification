package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[250]);
		String s2 = new String(new char[250]);
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[250];
		int len1;
		int len2;
		int len;
		int i;

		for (i = 0; i < 250; i++)
		{
			a[i] = 0;
			b[i] = 0;
			c[i] = 0;
		}

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

		len1 = s1.length();
		len2 = s2.length();

		if (len1 < len2)
		{
			len = len2;
		}
		else
		{
			len = len1;
		}

		for (i = 0; i < len1; i++)
		{
			a[i] = s1.charAt(len1 - 1 - i) - '0';
		}

		for (i = 0; i < len2; i++)
		{
			b[i] = s2.charAt(len2 - 1 - i) - '0';
		}

		for (i = 0; i < len; i++)
		{
			a[i] += b[i];
			if (a[i] >= 10)
			{
				a[i + 1]++;
				a[i] -= 10;
			}
		}
		if (a[len] > 0)
		{
			len++;
		}

		while (a[len - 1] == 0 && len > 1)
		{
			len--;
		}


		for (i = len; i > 0; i--)
		{
			System.out.printf("%d", a[i - 1]);
		}
	}


}

