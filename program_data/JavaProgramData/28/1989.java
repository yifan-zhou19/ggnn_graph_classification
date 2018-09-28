package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j = 0;
	   String a = new String(new char[5000]);
	   a = new Scanner(System.in).nextLine();
	   n = a.length();
	   for (i = 0;i < n;i++)
	   {
		   if (a.charAt(i) != ' ')
		   {
			   j++;
			   if (i == n - 1)
			   {
				   System.out.printf("%d",j);
			   }
		   }
		   else if (j != 0)
		   {
			   System.out.printf("%d,",j);
			   j = 0;
		   }
	   }
	return 0;
	}
}
