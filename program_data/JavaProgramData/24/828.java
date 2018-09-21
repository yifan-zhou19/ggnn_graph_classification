package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[1000]);
	  int n;
	  int i;
	  int mina;
	  int minb;
	  int maxa;
	  int maxb;
	  int l = 1;
	  int lmin = 1000;
	  int lmax = 0;
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  for (i = 1;i <= n - 1;i++)
	  {
		  if (a.charAt(i) != ' ' && i != n - 1)
		  {
			  l++;
		  }
		  else
		  {
				  if (i == n - 1)
				  {
					  l++;
					  i++;
				  }
				  if (l > lmax)
				  {
					  lmax = l;
					  maxa = i - l;
					  maxb = i - 1;
				  }
				  if (l < lmin)
				  {
					  lmin = l;
					  mina = i - l;
					  minb = i - 1;
				  }
				  l = 0;
		  }
	  }
	  for (i = maxa;i <= maxb;i++)
	  {
		  System.out.printf("%c",a.charAt(i));
	  }
	  System.out.print("\n");
	  for (i = mina;i <= minb;i++)
	  {
		  System.out.printf("%c",a.charAt(i));
	  }

	}
}
