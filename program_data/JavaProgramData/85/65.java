package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		char sn;
		int n;
		int i;
		int j;
		int k;
		&sn = new Scanner(System.in).nextLine();
		n = Integer.parseInt(sn);
		for (i = 0;i < n;i++)
		{
			k = 0;
		   s = new Scanner(System.in).nextLine();
		   if ((s.charAt(0) >= 65 && s.charAt(0) <= 90) || (s.charAt(0) >= 97 && s.charAt(0) <= 122) || (s.charAt(0) == 95))
		   {
			   for (j = 1;s.charAt(j) != '\0';j++)
			   {
				   if (!((s.charAt(j) >= 65 && s.charAt(j) <= 90) || (s.charAt(j) >= 97 && s.charAt(j) <= 122) || (s.charAt(j) == 95) || (s.charAt(j) >= 48 && s.charAt(j) <= 57)))
				   {
					   System.out.print("no\n");
					   k = 1;
					   break;
				   }


			   }
			   if (k == 0)
			   {
				   System.out.print("yes\n");
			   }
		   }
		   else
		   {
			   System.out.print("no\n");
		   }
		}
	}

}
