package <missing>;

public class GlobalMembers
{
	public static void f(String a, String b)
	{
		int t = 0;
		int i;
		int l;
		for (i = 1;;i++)
		{
			if (a[i].compareTo(a[t]) > 0)
			{
				t = i;
			}
			if (a[i].equals('\0'))
			{
				l = i;
				break;
			}
		}
		for (i = l;i >= t + 1;i--)
		{
			a[i + 3] = a[i];
		}
		a[l + 3] = '\0';
		for (i = t + 1;i <= t + 3;i++)
		{
			a[i] = b[i - t - 1];
		}
		System.out.printf("%s\n",a);
	}
	public static void Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String b = new String(new char[3]);
		char i = 0;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			f(a[i], b);
			if (a[i][0] == '\n')
			{
				break;
			}
		}
	}
}

