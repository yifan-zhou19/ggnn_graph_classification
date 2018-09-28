package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int l;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();

		for (i = 0;i < n;i++)
		{
		   a = new Scanner(System.in).nextLine();
		   l = a.length();
		   if (!((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || a.charAt(0) == '_'))
		   {
			 System.out.print("0\n");
		   }
		   else
		   {
			   for (j = 1;j < l;j++)
			   {
			   if (!((a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || a.charAt(j) == '_'))
			   {
				 System.out.print("0\n");
				 j = l + 1;
			   }
			   }
			   if (j == l)
			   {
				System.out.print("1\n");
			   }
		   }
		}

		System.in.read();
		System.in.read();
		System.in.read();

	}

}

