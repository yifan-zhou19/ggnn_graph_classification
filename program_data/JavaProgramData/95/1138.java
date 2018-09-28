package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		char d;
	int i;
	int j;
	int k;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	for (j = 0;(c = a.charAt(j)) != '\0';j++)
	{
		c = c;
	}
	for (k = 0;(d = b.charAt(k)) != '\0';k++)
	{
		d = d;
	}
	if (j == k)
	{
		for (i = 0;i <= j;i = i + 1)
		{
			c = a.charAt(i);
		if (c >= 'A' && c <= 'Z')
		{
			c -= 'A'-'a';
		}
		d = b.charAt(i);
		if (d >= 'A' && d <= 'Z')
		{
			d -= 'A'-'a';
		}
		  if (c == d)
		  {
			  continue;
		  }
		  else if (c > d)
		  {
			  System.out.print(">");
			  break;
		  }
		   else if (c < d)
		   {
			   System.out.print("<");
			   break;
		   }
		}
		   if (i >= j)
		   {
			 System.out.print("=");
		   }
	}
	}

}
