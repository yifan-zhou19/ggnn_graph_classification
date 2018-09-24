package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int l;
	int n;
	int i;
	int j;
	int k;
	String c = new String(new char[1000]);
	c = new Scanner(System.in).nextLine();
	l = c.length();
		 for (i = 1;i <= l - 1;i++)
		 {
		  for (j = 0;j < l - 1;j++)
		  {
		  for (n = 0;n <= i / 2;n++)
		  {
		  if (c.charAt(j + n) != c.charAt(j + i - n))
		  {
			  break;
		  }
		  else if (c.charAt(j + n) == c.charAt(j + i - n) && n < i / 2)
		  {
			  continue;
		  }
		  else
		  {
			  for (k = j;k < j + i;k++)
			  {
				  System.out.printf("%c",c.charAt(k));
			  }
			  System.out.printf("%c\n",c.charAt(j + i));
		  }
		  }
		  }
		 }
	}
}
