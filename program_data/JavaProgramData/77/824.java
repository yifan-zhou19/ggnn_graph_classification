package <missing>;

public class GlobalMembers
{
	public static int panduan(String a, char b, char g)
	{
		int l;
		int bj;
		int gj;
		int bs;
		int gs;
		int i;
		int k;
		int t;
		l = a.length();
		bj = 0;
		gj = 0;
		bs = 0;
		gs = 0;
		k = l - 1;
		while (!a[k].equals(b) && !a[k].equals(g))
		{
			k--;
		}
		for (i = k;i >= 0;i--)
		{
			if (a[i].equals(b))
			{
				bj++;
			}
			else if (a[i].equals(g))
			{
				gj++;
			}
			if (bj == gj)
			{
				bs = i;
				gs = k;
				break;
			}
		}
		t = 100 * bs + gs;
			return (t);
	}
	public static int Main()
	{
		String d = new String(new char[100]);
		int n;
		int length;
		int m;
		int i;
		int j;
		int t;
		int k;
		char boy;
		char girl;
		int[][] weishu = new int[100][2];
		d = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = d.length();
		boy = d.charAt(0);
		girl = d.charAt(length - 1);
		for (n = 0;n < length / 2;n++)
		{
			m = panduan(d, boy, girl);
			weishu[n][0] = m / 100;
			weishu[n][1] = m % 100;
			d = tangible.StringFunctions.changeCharacter(d, m / 100, '0');
			d = tangible.StringFunctions.changeCharacter(d, m % 100, '0');

		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (weishu[i][1] > weishu[i + 1][1])
				{
					t = weishu[i][1];
					weishu[i][1] = weishu[i + 1][1];
					weishu[i + 1][1] = t;
				m = weishu[i][0];
				weishu[i][0] = weishu[i + 1][0];
				weishu[i + 1][0] = m;
				}
			}
		}
		for (i = 0;i < length / 2;i++)
		{
			System.out.print(weishu[i][0]);
			System.out.print(" ");
			System.out.print(weishu[i][1]);
			System.out.print("\n");
		}
		return 0;
	}




}

