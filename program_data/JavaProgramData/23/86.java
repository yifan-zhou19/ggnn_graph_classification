package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[100]);
	 char[][] b = new char[100][100];
	 a = new Scanner(System.in).nextLine();
	 int i;
	 int l;
	 int w = 0;
	 int j = 0;
	 int k = 0;
	 int s = 0;
	 l = a.length();
	 for (i = 0;i < l;i++)
	 {
		  if (a.charAt(i) == ' ')
		  {
			   w = 0;
			   j++;
			   k = 0;
		  }
		   else if (w == 0 || w == 1)
		   {
				  b[j][k] = a.charAt(i);
				  w = 1;
				  k++;
		   }
	 }
	for (i = 0;i < l;i++)
	{
		 if (a.charAt(i) == ' ')
		 {
			w = 0;
		 }
		else if (w == 0)
		{
			   s++;
				w = 1;
		}
	}
	for (i = s;i > 0;i--)
	{
		 System.out.printf("%s ",b[i]);
	}
		System.out.printf("%s",b[0]);

	}
}
