package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[301];
	String c = new String(new char[301]);
	c = new Scanner(System.in).nextLine();
	n = c.length();
	for (i = 97;i < 123;i++)
	{
		for (j = 0;j < n;j++)
		{
		if (c.charAt(j) == i)
		{
	a[i]++;
		}
		}
	}
	for (i = 97;i < 123;i++)
	{
		if (a[i] != 0)
		{
		System.out.printf("%c=%d\n",i,a[i]);
	k++;
		}
	}
	if (k == 0)
	{
	System.out.print("No");
	}
	}
}
