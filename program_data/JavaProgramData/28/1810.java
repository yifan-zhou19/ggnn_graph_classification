package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int m;
	  int i;
	  int[] a = new int[310];
	  int e;
	  String s = new String(new char[1000]);
	  s = new Scanner(System.in).nextLine();
	  m = s.length();
	  e = 0;
	a[0] = -1;
	  for (i = 0;i < m;i++)
	  {
					  if (s.charAt(i) == 32)
					  {

								  e++;
								  a[e] = i;

					  }
	  }

	  for (i = 1;i <= e;i++)
	  {
				   if (a[i] - a[i - 1] - 1 != 0)
				   {
				   System.out.printf("%d,",a[i] - a[i - 1] - 1);
				   }
	  }
	  System.out.printf("%d",m - 1 - a[e]);


	}

}
