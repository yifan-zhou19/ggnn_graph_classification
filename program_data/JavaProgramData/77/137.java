package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int p;
	public static int t = 0;
	public static int n;
	public static int[] a = new int[500];
	public static int[] b = new int[500];
	public static int temp;

	public static String str = new String(new char[1000]);
	public static char c1;
	public static char c2;

	public static void f(int j)
	{
		 int i;
		 for (i = 0;i < n - 1;i++)
		 {
			if ((str.charAt(i) == c1) && (str.charAt(i + j) == c2))
			{
				a[t] = i;
				b[t] = i + j;
				//printf("%d %d\n",i,i+j);
				t++;
				str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				str = tangible.StringFunctions.changeCharacter(str, i + j, ' ');
			}
		 }

	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		c1 = str.charAt(0);
		c2 = str.charAt(n - 1);

		for (k = 1;k < n;k++)
		{
			f(k);
		}
		for (k = 0;k < n / 2;k++)
		{
			for (p = n / 2 - 1;p > k;p--)
			{
				if (b[p - 1] > b[p])
				{
					temp = b[p - 1];
					b[p - 1] = b[p];
					b[p] = temp;
					temp = a[p - 1];
					a[p - 1] = a[p];
					a[p] = temp;
				}
			}
		}
		for (k = 0;k < n / 2;k++)
		{
			System.out.printf("%d %d\n",a[k],b[k]);
		}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	return 0;
	}

}

