package <missing>;

public class GlobalMembers
{
	public static void num(String a, int[] c, int[] l, int n)
	{
		 int i;
		 int t;
		 for (i = 0;i < n;i++)
		 {
						 if (a[i].compareTo(91) < 0 && a[i].compareTo(64) > 0)
						 {
							 t = a[i] - 65;
							 c[t] = c[t] + 1;
						 }
						 if (a[i].compareTo(123) < 0 && a[i].compareTo(96) > 0)
						 {
							 t = a[i] - 97;
							 l[t] = l[t] + 1;
						 }
		 }
	}
	public static int Main()
	{
		void num(char a[],int c[],int l[],int n);
		final String a = "";
		final String b = "";
		int[][] cap = new int[2][26];
		int[][] lit = new int[2][26];
		int t = 1;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = a.length();
		m = b.length();
		num(a, cap[0], lit[0], n);
		num(b, cap[1], lit[1], m);
		for (i = 0;i < 26;i++)
		{
		if (cap[0][i] == cap[1][i] && lit[0][i] == lit[1][i])
		{
			;
		}
		else
		{
			t = 0;
			break;
		}
		}
	if (t == 0)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.print("YES");
	}
	}

}

