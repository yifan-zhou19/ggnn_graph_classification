package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = new int(int a[],int n);
		int min = new int(int a[],int n);
		char[][] s = new char[200][50];
		int n;
		int i;
		int j;
		int[] b = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max(b, n))
			{
				System.out.printf("%s\n",s[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == min(b, n))
			{
				System.out.printf("%s\n",s[i]);
				break;
			}
		}
		return 0;
	}

	public static int max(int[] a, int n)
	{
		int t = a[0];
		int i;
		for (i = 0;i < n;i++)
		{
			if (t < a[i])
			{
				t = a[i];
			}
		}
		return t;
	}

	public static int min(int[] a, int n)
	{
		int t = a[0];
		int i;
		for (i = 0;i < n;i++)
		{
			if (t > a[i])
			{
				t = a[i];
			}
		}
		return t;
	}
}

