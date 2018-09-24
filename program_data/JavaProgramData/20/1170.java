package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[12]);
	 String b = new String(new char[4]);
	 int i = 0;
	 int n;
	 int m = 0;
	 char c;
	 while (scanf("%s%s",a,b) != EOF)
	 {
	  n = a.length();
	  c = a.charAt(0);
	  while (i < n)
	  {
	   if (a.charAt(i) > c)
	   {
		c = a.charAt(i),m = i;
	   }
	   i++;
	  }
	  i = 0;
	  while (i <= m)
	  {
	   System.out.printf("%c",a.charAt(i));
	   i++;
	  }
	  System.out.printf("%s",b);
	  while (i < n)
	  {
	   System.out.printf("%c",a.charAt(i));
	   i++;
	  }
	  i = 0;
	  System.out.print("\n");
	  m = 0;
	 }
	}

}
