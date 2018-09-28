package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[500]);
	 int i;
	 int j;
	 int len;
	 int n;
	 int t;
	 int k;
	 str = new Scanner(System.in).nextLine();
	 len = str.length();
	 for (n = 2;n <= len;n++)
	 {
	 for (i = 0;i + n - 1 < len;i++)
	 {
		 t = i;
		 for (j = i + n - 1;t < j;j--,t++)
		 {
	  if (str.charAt(t) != str.charAt(j))
	  {
	   break;
	  }
	  else
	  {
	  if ((j == t + 1) || (j == t + 2))
	  {
	  for (k = i;k <= i + n - 1;k++)
	  {
	  System.out.printf("%c",str.charAt(k));
	  }
	  System.out.print("\n");
	  }
	  }
		 }
	 }
	 }
	 return 0;
	}

}
