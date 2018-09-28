package <missing>;

public class GlobalMembers
{
	public static void swi(int l, String s)
	{
		int i;
		int t;
		for (i = 0;i < l / 2;i++)
		{
			t = s[i];
			s[i] = s[l - i - 1];
			s[l - i - 1] = t;
		}
		return;
	}
	public static int Main()
	{
		String m = new String(new char[200]);
		String n = new String(new char[200]);
		String t = new String(new char[200]);
		int n1;
		int i;
		int j;
		int k;
		int lm;
		int ln;
		int q;
		int flag;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (n1 = 0;n1 < num;n1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = tempVar3.charAt(0);
			}
			flag = 0;
			lm = m.length();
			ln = n.length();
			if (lm < ln)
			{
				flag = 1;
			}
			else if (lm == ln && strcmp(m,n) < 0)
			{
				flag = 1;
			}
			if (flag != 0)
			{
				t = m;
				m = n;
				n = t;
				q = lm;
				lm = ln;
				ln = q;
				System.out.print('-');
			}
			swi(lm, m);
			swi(ln, n);
			for (i = 0;i < ln;i++)
			{
				if (m.charAt(i) >= n.charAt(i))
				{
					m.charAt(i) -= n.charAt(i);
				}
				else
				{
					m = tangible.StringFunctions.changeCharacter(m, i, 10 + m.charAt(i) - n.charAt(i));
					for (k = 1;!m.charAt(i + k);k++)
					{
						;
					}
					for (q = 1;q < k;q++)
					{
						m = tangible.StringFunctions.changeCharacter(m, i + q, 9);
					}
					m.charAt(i + q)--;
				}
			}
			for (i = ln;i < lm;i++)
			{
				m.charAt(i) -= '0';
			}
			for (lm--;!m.charAt(lm);lm--)
			{
				;
			}
			swi(lm + 1, m);
			for (i = 0;i <= lm;i++)
			{
				System.out.printf("%d",m.charAt(i));
			}
			if (n1 < num - 1)
			{
				System.out.print('\n');
			}
		}
		return 0;
	}

}

