package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String a = new String(new char[100]);
		String b = new String(new char[12]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
		   int l;
		  a = new Scanner(System.in).nextLine();
		  l = a.length();
		  for (j = 0;j < l;j++)
		  {
				 if ((a.charAt(j) >= 'A' && a.charAt(j) <= 'z') || (a.charAt(j) <= '9' && a.charAt(j) >= '0') || a.charAt(j) == '_')
				 {
			   continue;
				 }
			  else
			  {
			  break;
			  }
		  }
		  if (j == l)
		  {
			   if ((a.charAt(0) <= 'z' && a.charAt(0) >= 'A') || a.charAt(0) == '_')
			   {
			  System.out.print("1\n");
			   }
		  else
		  {
			   System.out.print("0\n");
		  }
		  }
		  else
		  {
			 System.out.print("0\n");
		  }
		}
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}
}

