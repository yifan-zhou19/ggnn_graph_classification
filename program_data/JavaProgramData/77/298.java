package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int i;
		int t = 0;
		int n = 0;
		int j;
		int x;
		int y;
		int[] B = new int[50];
		int[] G = new int[50];
		String a = new String(new char[100]);
		char b;
		char g;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		b = a.charAt(0);
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i) != b)
			{
				g = a.charAt(i);
				break;
			}
		}
		for (t = 0;t <= l - 2;t = t + 2)
		{
		for (i = 0;i < l - 1 - t;i++)
		{
			if (a.charAt(i) == b && a.charAt(i + t + 1) == g)
			{
				B[n] = i;
				G[n] = i + t + 1;
				a = tangible.StringFunctions.changeCharacter(a, i, 'q');
				a = tangible.StringFunctions.changeCharacter(a, i + t + 1, 'q');
				++n;
			}
		}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (G[j] > G[j + 1])
				{
					x = G[j];
					G[j] = G[j + 1];
					G[j + 1] = x;
					y = B[j];
					B[j] = B[j + 1];
					B[j + 1] = y;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d %d\n",B[i],G[i]);
		}
	}


}

