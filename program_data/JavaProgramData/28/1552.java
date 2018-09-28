package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[2000]);
	  char[][] a = new char[200][200];
		   int n = 0; //??m,n??????
		   int i;
		   int m = 0;
		   int[] c = new int[200];
		   s = new Scanner(System.in).nextLine();
		   for (i = 0;i < s.length() + 1;i++)
		   {
				  if (s.charAt(i) == ' ' || s.charAt(i) == '\0') //?????????????????
				  {
						 a[m][n] = '\0';
						 n = 0;
						 m++;
				  }
				  else
				  {
						 a[m][n] = s.charAt(i);
						 n++;
				  }
		   }
		   for (i = 0;i < m;i++)
		   {
				  c[i] = String.valueOf(a[i]).length();
		   }
		   for (i = 0;i < m - 1;i++)
		   {
		 if (c[i] != 0)
		 {
		  System.out.printf("%d",c[i]);
				  System.out.print(","); //?????????????????
		 }
		 else
		 {
		 continue;
		 }
		   }
		   System.out.printf("%d",c[m - 1]);
		   return 0;
	}

}
