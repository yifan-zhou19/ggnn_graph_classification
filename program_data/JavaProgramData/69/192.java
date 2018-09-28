package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[251]);
	   String b = new String(new char[251]);
	   int[] d = new int[251];
	   int[] e = new int[251];
	   int[] c = new int[251];
	   int m;
	   int n;
	   int i;
	   int j;
	   int t;
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   m = a.length();
	   n = b.length();
	   for (i = 0;i < m;i++)
	   {
	   d[m - 1 - i] = a.charAt(i) - '0';
	   }
	   for (i = 0;i < n;i++)
	   {
	   e[n - 1 - i] = b.charAt(i) - '0';
	   }
	   if (m > n)
	   {
		   t = m;
	   }
	   else
	   {
		   t = n;
	   }
	   for (i = 0;i < t;i++)
	   {
		   c[i] += (d[i] + e[i]);
		   if (c[i] > 9)
		   {
			 c[i + 1] = c[i + 1] + 1;
			 c[i] = c[i] % 10;
		   }
	   }
		if (c[t] > 0)
		{
		t++;
		}
		while (c[t - 1] == 0)
		{
		t--;
		}
		if (t == -1)
		{
		System.out.print("0");
		}
		else
		{
		for (i = t - 1;i >= 0;i--)
		{
		System.out.printf("%d",c[i]);
		}
		}
		System.out.print("\n");
		return 0;
	}

}
