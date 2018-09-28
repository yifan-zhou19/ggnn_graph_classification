package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int f = new int(char a[],int t);
	int n;
	int i;
	int p;
	int m;
	String a = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		a = new Scanner(System.in).nextLine();
		m = a.length();
		p = f(a, m);
		System.out.printf("%d\n",p);
	}
	}
	public static int f(String a, int t)
	{
		int c = 1;
		int l;
		for (l = 1;l <= t - 1;l++)
		{
			if ((!a[l].equals('_')) && (!((a[l].compareTo(48) >= 0 && a[l].compareTo(57) <= 0) || (a[l].compareTo(65) >= 0 && a[l].compareTo(90) <= 0) || (a[l].compareTo(97) >= 0 && a[l].compareTo(122) <= 0))))
			{
				c = 0;
				break;
			}
		}
		if ((c == 1) && (a[0].equals('_') || ((a[0].compareTo(65) >= 0 && a[0].compareTo(90) <= 0) || (a[0].compareTo(97) >= 0 && a[0].compareTo(122) <= 0))))
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return (c);
	}
}

