package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		 int k;
		while (i <= n + 1)
		{

			  String a = new String(new char[1000]);
			  a = new Scanner(System.in).nextLine();
			  int l;
			  l = a.length();
			  if (l > 1)
			  {
							 if (a.charAt(0) <= 'z' && a.charAt(0) >= 'A')
							 {
											   k = l - 1;
											   j = 1;
								   while (j < l)
								   {
									  if (a.charAt(j) >= 'A' && a.charAt(j) <= 'z')
									  {

												 k--;
									  }

									   else if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
									   {

												  k--;
									   }

									   else if (a.charAt(j) == '_')
									   {
												   k--;
									   }

									   j++;
								   }
								   if (k == 0)
								   {
											  System.out.print("1\n");
								   }
								   else
								   {
											 System.out.print("0\n");
								   }
							 }
							else if (a.charAt(0) == '_')
							{
									j = 1;
									k = l - 1;
									   while (j < l)
									   {
											if (a.charAt(j) >= 'A' && a.charAt(j) <= 'z')
											{

													  k--;
											}

											else if (a.charAt(j) >= ('0') && a.charAt(j) <= ('9'))
											{

													 k--;
											}

											 else if (a.charAt(j) == '_')
											 {
													 k--;
											 }

											   j++;
									   }
										 if (k == 0)
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
			  else if (l == 1)
			  {
					  if (a.charAt(0) >= 'A' && a.charAt(0) <= 'z')
					  {
					  System.out.print("1\n");
					  }
					  else if (a.charAt(0) == '_')
					  {
					  System.out.print("1\n");
					  }
					  else
					  {
						  System.out.print("0\n");
					  }

			  }
			  i++;
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

