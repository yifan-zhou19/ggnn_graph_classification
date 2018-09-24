package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int i;
		String str = new String(new char[300]);
		char x = 'A';
		while (k <= 299)
		{
		   str = tangible.StringFunctions.changeCharacter(str, k, System.in.read());
		   if (str.charAt(k) == '\n')
		   {
			   break;
		   }
		   k = k + 1;
		}
		  i = k;
		 while (x <= 'z')
		 {
		   n = 0,k = 0;
		   while (k <= i)
		   {
			  if (str.charAt(k) == x)
			  {
				  n = n + 1;
			  }
			  k = k + 1;
		   }
		   if (n != 0)
		   {
			   System.out.printf("%c=%d\n",x,n);
		   }
		   if (x == 'Z')
		   {
		   x = x + 7;
		   }
			else
			{
			x = x + 1;
			}
		 }
			k = 0;
			while (k <= i)
			{
			if ((str.charAt(k) >= 'A' && str.charAt(k) <= 'Z') || (str.charAt(k) >= 'a' && str.charAt(k) <= 'z'))
			{
			break;
			}
		   else if (k == i)
		   {
		   System.out.print("No\n");
		   }
		   k = k + 1;
			}
		 return 0;
	}
}

