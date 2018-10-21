package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int m = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}

		for (i = 0;;i++)
		{
			  while (true)
			  {


					if (a.charAt(i + j) == b.charAt(j) && a.charAt(i + j) != '\0')

					{
						 j++;
					   continue;
					}
					 else if (b.charAt(j) == '\0' && (a.charAt(i + j) == ' ' || a.charAt(i + j) == '\0') && (a.charAt(i - 1) == ' ' || i == 0))
					 {
						  j = 0;
						  System.out.printf("%s",c);
						  i += b.length() - 1;
						  break;
					 }
					  else
					  {
					  j = 0;
					  if (a.charAt(i) == '\0')
					  {
						  break;
					  }
				   else
				   {
					   System.out.printf("%c",a.charAt(i));
				   }
					  break;
					  }
			  }

			  if (a.charAt(i) == '\0')
			  {
				 break;
			  }


		}
	if (b.charAt(j) == '\0')
	{
						  System.out.printf("%s",c);
	}




		return 0;
	}

}

