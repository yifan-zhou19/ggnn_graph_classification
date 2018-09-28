package <missing>;

public class GlobalMembers
{
	public static int mpow(int a,int b)
	{
		int i;
		int c = 1;
		for (i = 0;i < b;i++)
		{
			c *= a;
		}
		return c;
	}


	public static int Main()
	{
		String a = new String(new char[10]);
		String d = new String(new char[10]);
		char c;
		int[] aa = new int[10];
		int[] b = new int[10];
		int m = 0;
		int n = 0;
		int i = 0;
		int t = 0;
		int l = 0;
		int j = 0;
		int h = 0;
		int s = 0;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		i = a.length();

			for (t = 0;t < i;t++)
			{
			if (a.charAt(t) >= 65 && a.charAt(t) <= 90)
			{
				aa[t] = a.charAt(t) - 55;
			}
			}

			for (t = 0;t < i;t++)
			{
			if (a.charAt(t) >= 97 && a.charAt(t) <= 122)
			{
				aa[t] = a.charAt(t) - 87;
			}
			}

			for (t = 0;t < i;t++)
			{
			if (a.charAt(t) >= 48 && a.charAt(t) <= 57)
			{
				aa[t] = a.charAt(t) - 48;
			}
			}



			for (h = 0;h < i;h++)
			{
			t = aa[h] * mpow(m, i - h - 1);
			s = s + t;
			}

		j = 0;

		if (s == 0)
		{
			System.out.print("0");
		}

		while (s >= 1)
		{
					b[j] = s % n;
			j++;
			s = s / n;
		}

			j--;

			for (l = j;l >= 0;l--)
			{
			if (b[l] > 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, l, b[l] + 'A' - 10);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, l, b[l] + '0');
			}
			}

		for (l = j;l >= 0;l--)
		{
			System.out.printf("%c",d.charAt(l));
		}
			System.out.print("\n");


	}
}

