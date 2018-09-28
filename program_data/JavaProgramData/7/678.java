package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int h;
		int n;
		int m;
		int result = 0;
		int count;
		str = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = str.length();
		m = a.length();
		for (i = 0;i < n;i++)
		{
						 count = 0;
						 if (str.charAt(i) == a.charAt(0))
						 {
										  h = i;
										  for (j = 0;j < m;j++)
										  {
														   if (str.charAt(h + j) == a.charAt(j))
														   {
																			  count++;
														   }
										  }
														   if (count == m)
														   {
																		System.out.printf("%s",b);
																		result = 1;
																		break;
														   }
														   if (count != m)
														   {
																		System.out.printf("%c",str.charAt(i));
														   }
						 }
						 else
						 {
							 System.out.printf("%c",str.charAt(i));
						 }
						 if (result == 1)
						 {
						 break;
						 }
		}
		for (i = h + m;i < n;i++)
		{
							 System.out.printf("%c",str.charAt(i));
		}


		return 0;
	}


}

