package <missing>;

public class GlobalMembers
{
	public static int lon(String a)
	{
		int i;
		int n = 0;
		for (i = 0; !a[i].equals('\0');i++)
		{
			n++;
		}
		return (n);
	}
	public static void Main()
	{
		final String a = "";
		final String b = "";
	   int i;
	   int j = 0;
	   int k = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < lon(a);i++)
		{
		  if (a.charAt(i) != ' ')
		  {
			  if (a.charAt(i - 1) != ' ')
			  {
				b.charAt(j)[k] = a.charAt(i);
				k++;
			  }
			  else
			  {
				  j++;
				  b.charAt(j)[k] = a.charAt(i);
				  k++;
			  }
		  }
		  else
		  {
			  k = 0;
		  }
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",lon(b.charAt(i)));
		}
		System.out.printf("%d",lon(b.charAt(j)));
	}
}
