package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int q;
	   int l;
	   String sr = new String(new char[1]);
	   String a = new String(new char[100]);
	   sr = new Scanner(System.in).nextLine();
	   n = Integer.parseInt(sr);
	   for (i = 1;i <= n;i++)
	   {
		  a = new Scanner(System.in).nextLine();
		  l = a.length();
		  if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
		  {
			q = 1;
		  }
			else
			{
				q = 0;
			}
			if (q == 1)
			{
			for (j = 1;j < l;j++)
			{
			 if (a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
			 {
			 q = 1;
			 }
			 else
			 {
				  q = 0;
				  break;
			 }
			}
			}

				  System.out.printf("%d\n",q);
	   }
				  System.in.read();
				  System.in.read();
	}
}
