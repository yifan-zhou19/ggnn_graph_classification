package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[2000]);
	   char[][] b = new char[300][20];
	   int i;
	   int n = 0;
	   int k = 0;
	   a = new Scanner(System.in).nextLine();
	   for (i = 0;a.charAt(i) != '\0';i++)
	   {
		   if (a.charAt(i) != ' ')
		   {
			  b[n][k] = a.charAt(i);
			  k++;
		   }
		   else if ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' '))
		   {
			  b[n][k] = '\0';
			  n++;
			  k = 0;
		   }
	   }
		b[n][k] = '\0';
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",(String.valueOf(b[i]).length()));
		}
		System.out.printf("%d",(String.valueOf(b[n]).length()));
		return 0;
	}


}
