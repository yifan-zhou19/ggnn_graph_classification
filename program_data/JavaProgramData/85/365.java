package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int panduan = new int(char c[][21],int n,int l);
		int n;
		int i;
		int[] len = new int[30];
		char[][] str = new char[30][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			len[i] = String.valueOf(str[i]).length();
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (panduan(str, i, len[i]) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
	public static int panduan(String[] c, int n, int l)
	{
		int i;
		int t = 1;
		for (i = 0;i <= l - 1;i++)
		{
			if ((c[n][i].compareTo('0') >= 0 && c[n][i].compareTo('9') <= 0) || (c[n][i].compareTo('a') >= 0 && c[n][i].compareTo('z') <= 0) || (c[n][i].compareTo('A') >= 0 && c[n][i].compareTo('Z') <= 0) || c[n][i].equals('_'))
			{
				t *= 1;
			}
			else
			{
				t *= 0;
			}
		}
		if (c[n][0].compareTo('0') >= 0 && c[n][0].compareTo('9') <= 0)
		{
			t *= 0;
		}
		return (t);
	}

}

