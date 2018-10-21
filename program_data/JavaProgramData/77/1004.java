package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int j = 1;
	  int i;
	  int m;
	  int e = 0;
	  int[] a = new int[101];
	  int d;
	  int f;
	  int u;
	  int v;
	  String s = new String(new char[101]);
	  s = new Scanner(System.in).nextLine();
	 m = s.length();
	 u = s.charAt(0);
	 v = s.charAt(m - 1);
	 for (i = 0;i < m;i++)
	 {
		if (s.charAt(i) == v)
		{
					 a[e] = i;
					 e++;
		}
	 }



	for (i = 0;i < e;i++)
	{
			for (j = 1;j < m;j++)
			{
			if (a[i] - j >= 0)

			{
					  f = 0;
					  for (d = a[i] - j;d <= a[i];d++)
					  {
					  f = f + s.charAt(d);
					  }
				   if (f == u + v)
				   {
				   System.out.printf("%d %d\n",a[i] - j,a[i]);
				   s = s.substring(0, a[i] - j);
				   s = s.substring(0, a[i]);
				   }
			}

			}
	}

	}

}
