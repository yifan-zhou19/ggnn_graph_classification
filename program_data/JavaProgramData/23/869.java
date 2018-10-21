package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[10000]);
	 char[][] b = new char[1000][1000];
	 int[] c = new int[1000];
	 int m;
	 int j = 1;
	 int i = 0;
	 int k = 0;
	 int x;
	 int y;
	 a = new Scanner(System.in).nextLine();
	 for (i = 0;i < a.length();i++)
	 {
		  if (a.charAt(i) == ' ')
		  {
			  j++;
		  }
	 }
	 i = 0;
	 for (m = 0;m < j;m++)
	 {
		for (;i < a.length();i++)
		{
		  if (a.charAt(i) != ' ')
		  {
			  b[m][k] = a.charAt(i);
			  k++;
		  }
			c[m] = k;
		  if (a.charAt(i) == ' ')
		  {

			  k = 0;
			  i = i + 1;
			  break;
		  }
		}
	 }

	  for (m = j - 1;m > 0;m--)
	  {

		for (x = 0;x < c[m];x++)
		{
		System.out.printf("%c",b[m][x]);
		}
	   System.out.print(" ");
	  }
	  for (y = 0;y < c[0];y++)
	  {
	  System.out.printf("%c",b[0][y]);
	  }
	}
}
