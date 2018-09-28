package <missing>;

public class GlobalMembers
{
	public static String l = new String(new char[500]);
	public static int len;
	public static int n = 0;
	public static int[][] record = new int[2000][3];
	public static int Main()
	{
	int i;
	int j;
	int k;
	void doit(int a,int b);
	l = new Scanner(System.in).nextLine();
	len = l.length();
	for (i = 0;i <= len - 1;i++)
	{
	  doit(i, i + 1);
	}
	for (i = 2;i <= len;i++)
	{
	 for (j = 1;j <= n;j++)
	 {
	 if (record[j][2] - record[j][1] + 1 == i)
	 {
		for (k = record[j][1];k <= record[j][2];k++)
		{
			System.out.printf("%c",l.charAt(k));
		}
		System.out.print("\n");
	 }
	 }
	}

	}

	public static void doit(int a,int b)
	{
	int i;
	int j;
	if (l.charAt(a) == l.charAt(b) && a - 1 >= 0 && b + 1 <= len - 1)
	{
		n++;
		record[n][1] = a;
		record[n][2] = b;
		doit(a - 1, b + 1);
	}
	if (l.charAt(a) == l.charAt(b) && (a == 0 || b == len - 1))
	{
		n++;
		record[n][1] = a;
		record[n][2] = b;
	}
	}
}
