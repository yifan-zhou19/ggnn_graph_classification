package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int z;
	int q;
	int s;
	int l;
	int[] a = new int[4];
	int t;
	int f = 0;
	int d;
	int m;
	String i = new String(new char[4]);
	char[] aq = {'z', 'q', 's', 'l'};
	for (z = 10;z <= 50;z = z + 10)
	{
		for (q = 10;q <= 50;q = q + 10)
		{
		for (s = 10;s <= 50;s = s + 10)
		{
		for (l = 10;l <= 50;l = l + 10)
		{
		if ((z + q) == (s + l) && (z + l) > (s + q) && q > (z + s))
		{
		   a[0] = z,a[1] = q;
		   a[2] = s,a[3] = l;
		}
		}
		}
		}
	}


	for (d = 0;d < 4;d++)
	{
		{
			for (t = 0;t < 4;t++)
			{

	   if (f < a[t])
	   {

	  f = a[t],i[d] = aq[t],m = t;
	   }
			}
	}

	System.out.printf("%c %d\n",i.charAt(d),f),a[m] = 0,f = 0;

	}
	}

}
