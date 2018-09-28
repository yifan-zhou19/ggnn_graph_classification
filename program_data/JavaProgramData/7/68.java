package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[257]);
		String a = new String(new char[257]);
		String a1 = new String(new char[257]);
		int i;
		int j;
		int len;
		int n = 0;
		int k;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		a1 = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
								if (s.charAt(i) == a.charAt(0))
								{
											   flag = 1;
											   n = i;
											   for (j = i + 1,k = 1;j < i + len;j++,k++)
											   {
																			  if (s.charAt(j) != a.charAt(k))
																			  {
																							 flag = 0;
																			  }
											   }
											   if (flag == 1)
											   {
												   break;
											   }
								}
		}
		if (flag == 1)
		{
					for (i = 0;i < n;i++)
					{
						System.out.printf("%c",s.charAt(i));
					}
					System.out.printf("%s",a1);
					for (i = n + len;s.charAt(i) != '\0';i++)
					{
						System.out.printf("%c",s.charAt(i));
					}
		}
		if (flag == 0)
		{
			System.out.printf("%s",s);
		}





		return 0;
	}
}
