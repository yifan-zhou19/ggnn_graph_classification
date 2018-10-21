package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int j = 0;
		String d = new String(new char[300]);
		for (i = 0;i < a.length();i++)
		{

			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
				j++;
			}
		}
		int m;
		int n;
		char c;
		for (m = 0;m < j;m++)
		{
			for (n = m + 1;n < j;n++)
			{
				if (d.charAt(n) < d.charAt(m))
				{
					c = d.charAt(m);
					   d = tangible.StringFunctions.changeCharacter(d, m, d.charAt(n));
					d = tangible.StringFunctions.changeCharacter(d, n, c);
				}
			}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			int k;
			int[] num = new int[100];
			int n;
			for (k = 0;k < j;k++)
			{
				for (n = 0;n < a.length();n++)
				{
					if (a.charAt(n) == d.charAt(k))
					{
						num[k]++;
					}
				}
			}
			int m;
			System.out.printf("%c=%d\n",d.charAt(0),num[0]);
			for (m = 1;m < j;m++)
			{
				if (d.charAt(m) != d.charAt(m - 1))
				{
					System.out.printf("%c=%d\n",d.charAt(m),num[m]);
				}
			}
		}
	}


}

