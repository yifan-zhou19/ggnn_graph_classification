package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int w;
		int t = 0;
		int[] c = new int[100];
	  String s = new String(new char[101]);
	  char[][] a = new char[100][100];
	  s = new Scanner(System.in).nextLine();
	  if (s.charAt(0) == ' ')
	  {
		  w = 0;
	  }
	  else
	  {
		  w = 1;
	  }
	  for (i = 1;s.charAt(i - 1) != '\0';i++)
	  {
		  if (w == 1)
		  {
			  a[t][c[t]] = s.charAt(i - 1);
		   c[t]++;
		   if (s.charAt(i) != ' ')
		   {
			   w = 1;
		   }
		   else
		   {
			   w = 0;
		   }
		   continue;
		  }
		 if (w == 0)
		 {
			 if (s.charAt(i) != ' ')
			 {
				 t++;
				 w = 1;
			 }
		 }
	  }
	  for (i = t;i >= 0;i--)
	  {
		  for (j = 0;j < c[i];j++)
		  {
		 System.out.printf("%c",a[i][j]);
		  }
		if (i >= 1)
		{
			System.out.print(" ");
		}
	  }
	}
}
