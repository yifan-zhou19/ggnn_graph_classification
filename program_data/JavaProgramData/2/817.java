package <missing>;

public class GlobalMembers
{
	public static int[] w = new int[26]; //zimu 0 26
	public static int p = 0;
	public static void zimu(String a)
	{
		int m;
		int i;
		int j;
		char c;
		m = a.length();
		for (j = 0;j < 26;j++)
		{
			c = 'A' + j;

			for (i = 0;i < m;i++)
			{
			if (a[i].equals(c))
			{
				w[j]++;
			}
			}

		} //for1 end
	}
	public static int max(int[] w)
	{
		int i;
		int max;
		max = w[0];
		for (i = 1;i < 26;i++)
		{
			if (w[i] > max)
			{
				max = w[i];
				p = i;

			}
		}
				return max;
	}

	public static void Main()
	{
		char[][] b = new char[300][20];
		int[] a = new int[300];
		int m;
		int i;
		int j;
		int mm;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			zimu(b[i]);
		}
		mm = max(w);

	System.out.printf("%c\n",p + 'A');
	System.out.printf("%d\n",mm);
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < (String.valueOf(b[i]).length());j++)
		{
			if (b[i][j] == (p + 'A'))
			{
				System.out.printf("%d\n",a[i]);
				break;
			}
		}
	}

	}




}

