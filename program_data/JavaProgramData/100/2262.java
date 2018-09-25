package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String c = new String(new char[300]);
	 c = new Scanner(System.in).nextLine();
	 int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	 int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	 int s = 0;
	 int i = 0;
	 int j = 0;
	 char d = 'A';
	 char e = 'a';
	 while (i < 26)
	 {
	  while (c.charAt(j) != '\0')
	  {
	   if (c.charAt(j) == d)
	   {
		a[i]++;
	   }
	   j++;
	  }
	  j = 0;
	  if (a[i] != 0)
	  {
	   System.out.printf("%c=%d\n",d,a[i]);
	  }
	  i++;
	  d++;
	 }
	 i = 0;
	 while (i < 26)
	 {
	  while (c.charAt(j) != '\0')
	  {
	   if (c.charAt(j) == e)
	   {
		b[i]++;
	   }
	   j++;
	  }
	  j = 0;
	  if (b[i] != 0)
	  {
	   System.out.printf("%c=%d\n",e,b[i]);
	  }
	  i++;
	  e++;
	 }
	 i = 0;
	 while (i < 26)
	 {
	  s = s + a[i] + b[i];
	  i++;
	 }
	 if (s == 0)
	 {
	  System.out.print("No");
	 }
	}
}
