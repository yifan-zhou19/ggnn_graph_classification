package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[300]);
	 char[][] a = new char[300][300];
	 int i;
	 int k;
	 int b = 0;
	 int j = 0;
	 int w = 0;
	 int p;
	 s = new Scanner(System.in).nextLine();
	 k = s.length();
	 for (i = 0;i < k;i++)
	 {
		 if (s.charAt(i) == ' ')
		 {
			 b++;
		 }
	 }
	 for (i = 0;i < k;i++)
	 {
	  if (s.charAt(i) != ' ')
	  {
	   a[j][w] = s.charAt(i);
	   w++;
	  }
	  else
	  {
	   a[j][w] = '\0';
	   w = 0;
	   j++;
	  }
	 }
	 a[j][w] = '\0';
	 for (i = b;i >= 1;i--)
	 {
		 System.out.printf("%s ",a[i]);
	 }
	 System.out.printf("%s",a[0]);
	}
}
