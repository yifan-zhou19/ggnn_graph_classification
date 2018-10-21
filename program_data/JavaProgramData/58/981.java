package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		int j;
		int m;
		int o;
		String s = new String(new char[82]);
		System.in.read();
		for (i = 0;i < n;i++)
		{
		s = new Scanner(System.in).nextLine();
		for (j = 0;;j++)
		{
					 if (s.charAt(j) == '\0')
					 {
								   System.out.print("1\n");
								   break;
					 }
					 if (j == 0)
					 {
							 for (k = 0;k < 26;k++)
							 {
											  if ((s.charAt(j) == 'a' + k) || (s.charAt(j) == 'A' + k) || s.charAt(j) == '_')
											  {
																			 break;
											  }
							 }
							 if (k == 26)
							 {
																 System.out.print("0\n");
																 break;
							 }
					 }
					 if (j != 0)
					 {
							 for (k = 0;k < 26;k++)
							 {
											  if ((s.charAt(j) == 'a' + k) || (s.charAt(j) == 'A' + k) || s.charAt(j) == '_' || s.charAt(j) == '0' || s.charAt(j) == '1' || s.charAt(j) == '2' || s.charAt(j) == '3' || s.charAt(j) == '4' || s.charAt(j) == '5' || s.charAt(j) == '6' || s.charAt(j) == '7' || s.charAt(j) == '8' || s.charAt(j) == '9')
											  {
																			 break;
											  }
							 }
							 if (k == 26)
							 {
										System.out.print("0\n");
										break;
							 }
					 }

		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();

	}
}

