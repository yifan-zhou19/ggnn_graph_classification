package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s = new String(new char[100]);
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j;
		int k;
		int n;
		int u;
		int v;
		int m;
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
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			j = 0;
			while (s1.charAt(j) != '\0')
			{
				a[j] = s1.charAt(j) - '0';
				j++;
			}
			k = 0;
			while (s2.charAt(k) != '\0')
			{
				b[k] = s2.charAt(k) - '0';
				k++;
			}
			u = 0;
			m = 0;

			while (k > 0)
			{
				c[u] = a[j - 1] - b[k - 1] - m;

				if (c[u] < 0)
				{
					m = 1;
				}
				else
				{
					m = 0;
				}
				c[u] = c[u] + 10 * m;
				j--;
				k--;
				u++;

			}
			while (m == 1 || j > 0)
			{
				c[u] = a[j - 1] - m;
				if (c[u] < 0)
				{
					m = 1;
				}
				else
				{
					m = 0;
				}
				c[u] = c[u] + 10 * m;
				j--;
				u++;
			}

			for (v = 0;v < u;v++)
			{
				s = tangible.StringFunctions.changeCharacter(s, v, c[v] + '0');
			}
			while (s.charAt(u - 1) == '0')
			{
				u--;
			}
			while (u > 0)
			{
				System.out.printf("%c",s.charAt(u - 1));
				u--;
			}
			System.out.print("\n");
		}
	}





}

