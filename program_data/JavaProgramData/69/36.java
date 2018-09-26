package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int p = 0;
		int lena;
		int lenb;
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[250];
		String s = new String(new char[250]);
		String t = new String(new char[250]);
		String temp = new String(new char[250]);

			for (i = 0;i < 250;i++)
			{
				a[i] = 0;
				b[i] = 0;
				c[i] = 0;
			}

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = tempVar2.charAt(0);
			}
			lena = s.length();
			lenb = t.length();
			if (lena < lenb)
			{
				temp = s;
				s = t;
				t = temp;
			}
			lena = s.length();
			lenb = t.length();
			for (i = lena - 1;i >= 0;i--)
			{
				a[lena - 1 - i] = s.charAt(i) - 48;
			}
			for (i = lenb - 1;i >= 0;i--)
			{
				b[lenb - 1 - i] = t.charAt(i) - 48;
			}
			for (i = 0;i <= lena;i++)
			{
				if (a[i] + b[i] >= 10)
				{
					c[i] += a[i] + b[i] - 10;
					a[i + 1]++;
				}
				else
				{
					c[i] += a[i] + b[i];
				}
			}

			for (k = i - 1;k >= 0;k--)
			{
				if (c[k] != 0 && p == 0)
				{
					p = 1;
				}
				if (p == 1)
				{
					System.out.printf("%d",c[k]);
				}
			}
			if (p == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
			return 0;
	}
}

