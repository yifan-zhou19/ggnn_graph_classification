package <missing>;

public class GlobalMembers
{
	public static int f(String str, int[] re)
	{
		int k = 0;
		int n = 0;
		int l;
		l = str.length();
		while (k < l)
		{
				  re[n] = 0;
				  while ((!str[k].equals(',')) && (!str[k].equals('\0')))
				  {
				  re[n] = re[n] * 10 + str[k++] - '0';
				  }
				  k++;
				  n++;
		}
		return (n);
	}

	public static void Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[1000];
		int n = 0;
		int i;
		int j;
		int max = 0;
		String a = new String(new char[100000]);
		String b = new String(new char[100000]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = f(a, x);
		n = f(b, y);
		for (i = 0;i < n;i++)
		{
		   for (j = x[i];j < y[i];j++)
		   {
			  t[j]++;
		   }
		}
		for (i = 0;i < 1000;i++)
		{
		if (max < t[i])
		{
			max = t[i];
		}
		}
		System.out.printf("%d %d\n",n,max);
	}
}
