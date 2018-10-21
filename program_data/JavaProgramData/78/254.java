package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
	 int[] a = new int[4];
	 int t;
	 int i;
	 int j;
	 char[] b = {'z', 'q', 's', 'l'};
	 char c;
	 for (z = 10;z <= 50;z += 10)
	 {
	  for (q = 10;q <= 50;q += 10)
	  {
	  for (s = 10;s <= 50;s += 10)
	  {
	  for (l = 10;l <= 50;l += 10)
	  {
	  if ((z + q == s + l) && (z + l > s + q) && (z + s < q) && z != q && z != s && z != l && q != s && q != l && s != l)
	  {
	  a[0] = z,a[1] = q,a[2] = s,a[3] = l;
	  }
	  }
	  }
	  }
	 }
	 for (i = 0;i < 3;i++)
	 {
	  for (j = i + 1;j < 4;j++)
	  {
	  if (a[i] < a[j])
	  {
		  t = a[i],a[i] = a[j],a[j] = t,c = b[i],b[i] = b[j],b[j] = c;
	  }
	  }
	 }
	 for (i = 0;i < 4;i++)
	 {
	 System.out.printf("%c %d\n",b[i],a[i]);
	 }
	}
}
