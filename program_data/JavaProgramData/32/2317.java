package <missing>;

public class GlobalMembers
{
	public static void change(String ch, int[] a)
	{
		int i;
		int nc;
		nc = ch.length();
		for (i = 0;i < nc;i++)
		{
			a[i] = ch[i] - 48;
		}
	}

	public static void minus(int[] a, int[] b, int na, int nb)
	{
		int i;
		for (i = 1;i <= nb;i++)
		{
			if (a[na - i] < b[nb - i])
			{
				a[na - i - 1]--;
				a[na - i] = a[na - i] - b[nb - i] + 10;
			}
			else
			{
				a[na - i] -= b[nb - i];
			}
		}
	}

	public static void print(int[] a, int na)
	{
		int i;
		int j = 0;
		for (j = 0;a[j] == 0;j++)
		{
			i++;
		}
		for (i = j;i < na;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		String c = new String(new char[100]);
		int n;
		int i;
		int j;
		int na;
		int nb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			na = c.length();
			change(c, a);
			for (j = 0;j < 100;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = tempVar3.charAt(0);
			}
			nb = c.length();
			change(c, b);
			minus(a, b, na, nb);
			print(a, na);
			System.out.print("\n");
		}
		return 0;
	}
}

