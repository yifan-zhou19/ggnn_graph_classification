package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int n;
		int i = 1;
		int j = 0;
		int len;
		int M = 0;
		String A = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
	  while (i <= n)
	  {
		  A = new Scanner(System.in).nextLine();
		  len = A.length();
		  if ((A.charAt(j) >= 'A' && A.charAt(j) <= 'Z') || (A.charAt(j) >= 'a' && A.charAt(j) <= 'z') || A.charAt(j) == '_')
		  {
			   M++;
			  for (j = 1;j <= len - 1;j++)
			  {
				   if ((A.charAt(j) >= 'A' && A.charAt(j) <= 'Z') || (A.charAt(j) >= 'a' && A.charAt(j) <= 'z') || (A.charAt(j) >= '0' && A.charAt(j) <= '9') || A.charAt(j) == '_')
				   {
					   M++;
				   }
			  }
				if (M == len)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
		  }
		   else
		   {
			   System.out.print("no\n");
		   }
		   i++;
		   M = 0;
		   j = 0;
	  }
	}
}

