package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[1000];
	public static String n1 = new String(new char[1000]);
	public static String n2 = new String(new char[1000]);
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int m;
	public static int n;
	public static int xys;
	public static int ysc;
	public static int Main()
	{
		n1 = new Scanner(System.in).nextLine();
		n2 = new Scanner(System.in).nextLine();
		a[0] = n1.length();
		for (i = 1;i <= a[0];++i)
		{
			a[i] = n1.charAt(a[0] - i) - '0';
		}
		b[0] = n2.length();
		for (i = 1;i <= b[0];++i)
		{
			b[i] = n2.charAt(b[0] - i) - '0';
		}
		int len = Math.max(a[0],b[0]);
		j = 0;
		for (i = 1;i <= len;++i)
		{
			c[i] = a[i] + b[i] + j;
			j = c[i] / 10;
			c[i] = c[i] % 10;
		}
		c[0] = len;
		if (j > 0)
		{
			c[++c[0]] = j;
		}
		while (c[c[0]] == 0 && c[0] > 1)
		{
			--c[0];
		}
		for (i = c[0];i > 0;--i)
		{
			System.out.printf("%d",c[i]);
		}
		return 0;
	}


}
