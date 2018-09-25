package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		int[] b = new int[50];
		int[] c = new int[50];
		int k;
		int p;
		int q;
		int i;
		int j;
		int s = 0;
		int n;
		int min;
		int h;
		int z;
		char f;
		char g;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		f = a.charAt(0);
		 g = a.charAt(n - 1);
		 for (z = 1;z <= 50;z++)

		 {
			 for (i = 0;i < (n - 1);i++)
			 {
				 h = 0;
			if (a.charAt(i) == f)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a.charAt(j) == g)
					{
						break;
					}
					else
					{
						if (a.charAt(j) == f)
						{
							h = 1;
							break;
						}
					}

				}
			if (h == 1)
			{
				continue;
			}
			else
			{
				b[s] = i;
				c[s] = j;
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				s++;
			}
			}
			 }
		 }

			for (q = 1;q <= n / 2;q++)
			{
				min = 300;
			for (k = 0;k < n / 2;k++)
			{
				if (c[k] < min)
				{
					min = c[k];
					p = k;
				}
			}
				System.out.printf("%d %d\n",b[p],c[p]);
				b[p] = 400;
				c[p] = 400;
			}

		return 0;
	}


}

