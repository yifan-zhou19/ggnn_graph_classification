package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[350];
		int[] b = new int[350];
		int[] c = new int[351];
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		int i;
		int j;
		int k;
		int u;
		int N;
		int s;


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
			s = 0; //s????
			while ((j > 0) && (k > 0))
			{
				c[u] = a[j - 1] + b[k - 1] + s;
				s = c[u] / 10;
				c[u] = c[u] % 10;
				j--;
				k--;
				u++;
			}
	/*????while?????????j>k?a????????????????*/
			while (j > 0)
			{
				c[u] = a[j - 1] + s;
				s = c[u] / 10;
				c[u] = c[u] % 10;
				j--;
				u++;
			}
			while (k > 0)
			{
				c[u] = b[k - 1] + s;
				s = c[u] / 10;
				c[u] = c[u] % 10;
				k--;
				u++;
			}
			if (s == 1)
			{ //????????
				c[u] = s;
				u++;
			}
	while (u > 1 && c[u - 1] == 0)
	{
	u--;
	}
			while (u > 0)
			{
					System.out.printf("%d", c[u - 1]);
				u--;
			}
			System.out.print("\n");

	}

}

