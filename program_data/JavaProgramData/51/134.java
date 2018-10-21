package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(char s[],int n,int len,int i);
		int n;
		int len = 0;
		int i = 0;
		int j = 0;
		int t = 0;
		int x = 0;
		String s = new String(new char[500]);
		String p = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		for (i = 0;i < len - n + 1;i++)
		{
			p = tangible.StringFunctions.changeCharacter(p, i, f(s, n, len, i));
		}
		for (i = 0,t = p.charAt(0);i < len - n + 1;i++)
		{
			if (t < p.charAt(i))
			{
				t = p.charAt(i);
			}
		}
		if (t == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",t + 1);
			for (i = 0;i < len - n + 1;i++)
			{
				if (p.charAt(i) == t)
				{
				 for (j = i;j < i + n;j++)
				 {
					System.out.printf("%c",s.charAt(j));
				 }
				 System.out.print("\n");
				}
			}
		}
	}

	public static int f(String s, int n, int len, int i)
	{
		int j;
		int cou = 0;
		int k;
		int q;
		for (j = i + 1;j < len - n + 1;j++)
		{
			if (s[j].equals(s[i]))
			{
				for (k = i,q = j;k < i + n;k++)
				{
					if (s[k].equals(s[q]))
					{
						q++;
					}
				}
				if (q >= j + n)
				{
					cou++;
				}
			}
		}
		return (cou);
	}
}

