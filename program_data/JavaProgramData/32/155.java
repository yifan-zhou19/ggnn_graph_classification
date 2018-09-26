package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len1;
		int len2;
		int p;
		int q;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < 100;j++)
			{
				a[j] = 0;
				b[j] = 0;
				c[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			len1 = s1.length();
			len2 = s2.length();
			for (p = 0;p < len1;p++)
			{
				a[len1 - p - 1] = s1.charAt(p) - '0';
			}
			for (p = 0;p < len2;p++)
			{
				b[len2 - p - 1] = s2.charAt(p) - '0';
			}
			for (p = 0;p < len1;p++)
			{
				c[p] = a[p] - b[p];
				if (c[p] < 0)
				{
					a[p + 1] = a[p + 1] - 1;
					c[p] = c[p] + 10;
				}
			}
			while (c[len1] == 0 && len1 > 1)
			{
				len1 = len1 - 1;
			}
			for (q = len1;q >= 0;q--)
			{
				System.out.printf("%d",c[q]);
			}

			System.out.print("\n");
			}
	}
}

