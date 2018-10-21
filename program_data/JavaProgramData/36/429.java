package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int g = new int(int a[],int b[],int n);
		void f(char a[],int b[]);
		int[] c = new int[26];
		int[] d = new int[26];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		f(a, c);
		f(b, d);
		if (g(c, d, 0) == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
	public static int g(int[] a, int[] b, int n)
	{
		if (n == 25)
		{
			if (a[25] == b[25])
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			if (a[n] == b[n])
			{
				return (g(a, b, n + 1));
			}
			else
			{
				return (0);
			}
		}
	}
	public static void f(String a, int[] b)
	{
		int i;
		int p;
		p = a.length();
		for (i = 0;i < p;i++)
		{
			b[a[i] - 'a']++;
		}
	}
}

