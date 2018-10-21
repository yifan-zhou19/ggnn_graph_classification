package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
	 int c;
	 int d;
	 int n;
	 int i;
	 int s;
	 String p = a;
	 for (n = 0;n <= 5;)
	 {
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   p.Substring(n) = Integer.parseInt(tempVar);
		   }
		 if (*(p.Substring(n)) == ' ')
		 {
		   break;
		 }
		 else
		 {
		  n = n + 1;
		 }
	 }
	   *(p.Substring(n)) = 0;
	 b = new Scanner(System.in).nextLine();
	 c = a.length();
	 d = b.length();
	 for (n = 0;n <= d - 1;)
	 {
		 if (b.charAt(n) != a.charAt(0))
		 {
	  n++;
		 }
	  else
	  {
		   for (i = n;i < n + c;i++)
		   {
			 if (b.charAt(i) == a.charAt(i - n))
			 {
		  s = 0;
			 }
		  else
		  {
				s = 1;
				break;
		  }
		   }
		if (s == 0)
		{
			 System.out.printf("%d",n);
		   break;
		}
		else
		{
			n = n + 1;
		}
	  }
	 }
	}



}

