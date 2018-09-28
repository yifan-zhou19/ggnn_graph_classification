package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int mm = 0;
		int j;
		int len;
		String s = new String(new char[90]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		s = new Scanner(System.in).nextLine();
		len = s.length();
					for (j = 0;j < len;j++)
					{
					 if ((s.charAt(j) >= 48 && s.charAt(j) <= 57) || (s.charAt(j) >= 65 && s.charAt(j) <= 90) || (s.charAt(j) >= 97 && s.charAt(j) <= 122) || (s.charAt(j) == '_'))
					 {
						 mm = 0;
					 }

					 else
					 {
						 mm = 1;
						 break;
					 }
					}


		if (mm == 0 && (s.charAt(0) == '_' || (s.charAt(0) >= 65 && s.charAt(0) <= 90) || (s.charAt(0) >= 97 && s.charAt(0) <= 122)))
		{
			System.out.print("1\n");
		}
		else
		{
		 System.out.print("0\n");
		}

		}



	return 0;
	}

}

