package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int c;
		int i;
		int j;
		int u;
		int p;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 for (j = 2;j < 500;j++)
		 {
			  c = j / 2;

		   for (i = 0;i < 499;i++)
		   {
			if (a.charAt(i) == '\0')
			{
				break;
			}
		   for (u = 0;u < c;u++)
		   {
			   if (a.charAt(i + u) != a.charAt(i + j - 1 - u))
			   {
				   break;
			   }
			if (u == c - 1)
			{
			 if (a.charAt(i + c - 1) == a.charAt(i + j - c))
			 {
			for (p = i;p < i + j;p++)
			{
				  System.out.print(a.charAt(p));
			   if (p == i + j - 1)
			   {
			   System.out.print("\n");
			   }
			}
			 }
			}
		   }
		   }
		 }

	  return 0;
	}

}

