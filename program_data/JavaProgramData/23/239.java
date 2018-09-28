package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[5000]);
	   char[][] a = new char[100][50];
	   int i;
	   int n;
	   int k = 0;
	   int j = 0;
	   str = new Scanner(System.in).nextLine();
	   n = str.length();
	   for (i = 0;i < n;i++)
	   {
		 if (str.charAt(i) != ' ')
		 {
		   a[k][j] = str.charAt(i);
		   j++;
		 }
		 if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
		 {
		   k++;
		   j = 0;
		 }
	   }
	   k++;
	  System.out.printf("%s",a[k - 1]);
	  for (i = k - 2;i >= 0;i--)
	  {
		  System.out.printf(" %s",a[i]);
	  }
	  return 0;
	}


}
