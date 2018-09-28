package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();

		for (i = 0;i <= n - 2;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A')
			{
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
				}
				if (a.charAt(j) == '\0')
				{
					System.out.print("1\n");
				}
			}
		   else if (a.charAt(0) <= 'z' && a.charAt(0) >= 'a')
		   {
			   for (j = 0;a.charAt(j) != '\0';j++)
			   {
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
			   }
			   if (a.charAt(j) == '\0')
			   {
				   System.out.print("1\n");
			   }
		   }
		   else if (a.charAt(0) == '_')
		   {
			   for (j = 0;a.charAt(j) != '\0';j++)
			   {
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
			   }
			   if (a.charAt(j) == '\0')
			   {
				   System.out.print("1\n");
			   }
		   }
		   else
		   {
			   System.out.print("0\n");
		   }
		}
		a = new Scanner(System.in).nextLine();
		if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
			}

			if (a.charAt(j) == '\0')
			{
				System.out.print("1");
			}
		}
		else if (a.charAt(0) <= 'z' && a.charAt(0) >= 'a')
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
			}
			if (a.charAt(j) == '\0')
			{
				System.out.print("1");
			}
		}
		else if (a.charAt(0) == '_')
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
					if (a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
			}
			if (a.charAt(j) == '\0')
			{
				System.out.print("1");
			}
		}
		else
		{
			   System.out.print("0");
		}
	}


}

