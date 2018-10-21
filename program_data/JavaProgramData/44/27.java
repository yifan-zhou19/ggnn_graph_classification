package <missing>;

public class GlobalMembers
{
	public static int num(int n)
	{
		int c;
		int x;
		int y;
		int i;
		int j;
		int[] a = new int[100];
		int k;
		int nu;
		j = 0;
		nu = 0;

	if (n > 0)
	{
		nu = 1;
	}
	if (n < 0)
	{
		nu = -1;
		n = n * nu;
	}
	y = Math.log10(n);
	for (i = y;i >= 0;i--)
	{
		x = n / (Math.pow(10,i));
		a[j] = x;
		j++;
		n = n - x * Math.pow(10,i);
	}
	k = 0;
	j = 0;
	x = 0;
	for (i = 0;i <= y;i++)
	{
		k = k + a[i] * Math.pow(10,x);
		x++;
	}
	return (k * nu);
	}







	public static int Main()
	{
		int l;
		int m;
	 for (l = 0;scanf("%d", m) == 1;l++)
	 {
		 System.out.printf("%d\n",num(m));
	 }
	return 0;
	}
}
