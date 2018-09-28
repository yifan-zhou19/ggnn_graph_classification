import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[500]);
	   a = new Scanner(System.in).nextLine();
	   int b = a.length();
	   int wide = 2;
	   while (true)
	   {
	   for (int i = 0;i < b - 1;i++)
	   {
		   if (a.charAt(i) == a.charAt(i + 1))
		   {
			   if (i + 1 - i + 1 == wide)
			   {
				System.out.print(a.charAt(i));
				System.out.print(a.charAt(i + 1));
				System.out.print("\n");
			   }
				int m = i;
				int n = i + 1;
				while (true)
				{
				   m--;
				   n++;
				   if (a.charAt(m) == a.charAt(n))
				   {
					  if (n - m + 1 == wide)
					  {
					  for (int k = m;k <= n;k++)
					  {
						System.out.print(a.charAt(k));
					  }
					  }
					  System.out.print("\n");
				   }
				   else
				   {
					break;
				   }
				}
		   }
	   }
		wide += 2;
		if (wide == b + 2)
		{
		break;
		}
	   }

	 return 0;
	}

}
