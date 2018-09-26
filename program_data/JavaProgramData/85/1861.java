package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int n;
		int l = 0;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s = tempVar2.charAt(0);
		 }
			l = s.length();


			if (((s.charAt(0) >= 'A') && (s.charAt(0) <= 'Z')) || ((s.charAt(0) >= 'a') && (s.charAt(0) <= 'z')) || (s.charAt(0) == '_'))
			{
				   for (j = 1;j < l;j++)
				   {
				  if (((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')) || ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || (s.charAt(j) == '_') || ((s.charAt(j) >= '0') && (s.charAt(j) <= '9')))
				  {
					k++;
				  }
				  else
				  {
						System.out.println("no");
						k = 0;
						break;
				  }
				   }

				  if (k + 1 == l)
				  {
					  System.out.println("yes");
					  k = 0;
				  }
			}

					  else
					  {
							System.out.println("no");
							k = 0;
					  }
		}

			 return 0;

	}


}

