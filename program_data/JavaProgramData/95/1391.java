package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[3][100];
	int i;
	int j;
	int len1;
	int len2;
	int p;
	p = 1;
	a[1] = new Scanner(System.in).nextLine();
	a[2] = new Scanner(System.in).nextLine();
	len1 = String.valueOf(a[1]).length();
	len2 = String.valueOf(a[2]).length();
	if (len1 >= len2)
	{
		i = len2;
	}
	 else
	 {
		 i = len1;
	 }
	for (j = 0;j <= i - 1;j++)
	{
		 if (a[1][j] >= 65 && a[1][j] <= 90)
		 {
			 a[1][j] = a[1][j] + 32;
		 }
		 if (a[2][j] >= 65 && a[2][j] <= 90)
		 {
			 a[2][j] = a[2][j] + 32;
		 }
		  if (a[1][j] > a[2][j])
		  {
			  System.out.print(">");
			  p = 1;
			  break;
		  }
			else if (a[1][j] < a[2][j])
			{
				p = 1;
				System.out.print("<");
				break;
			}
			   else
			   {
				   p = 0;
			   }
	}
	if (p == 0 && len1 == len2)
	{
		System.out.print("=");
	}
	}

}
