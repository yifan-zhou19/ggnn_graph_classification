package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			int j;
			l = a.length();
			if (a.charAt(0) == '_')
			{
				for (j = 1;j < l;j++)
				{
					if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
					{
					 ;
					}
					 else if (a.charAt(j) == '_')
					 {
					 ;
					 }
					 else if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
					 {
					 ;
					 }
					 else if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
					 {
					  ;
					 }
					  else
					  {
						  System.out.print("0\n");
					  break;
					  }

				}
				if (j == l)
				{
				System.out.print("1\n");
				}
			}
			else if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
			{
				 for (j = 1;j < l;j++)
				 {
					if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
					{
					 ;
					}
					 else if (a.charAt(j) == '_')
					 {
					 ;
					 }
					 else if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
					 {
					 ;
					 }
					 else if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
					 {
					  ;
					 }
					  else
					  {
						  System.out.print("0\n");
					  break;
					  }

				 }
				if (j == l)
				{
				System.out.print("1\n");
				}
			}
			else if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')
			{

				 for (j = 1;j < l;j++)
				 {
					if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
					{
					 ;
					}
					 else if (a.charAt(j) == '_')
					 {
					 ;
					 }
					 else if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
					 {
					 ;
					 }
					 else if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
					 {
					  ;
					 }
					  else
					  {
						  System.out.print("0\n");
					  break;
					  }

				 }
				if (j == l)
				{
				System.out.print("1\n");
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

