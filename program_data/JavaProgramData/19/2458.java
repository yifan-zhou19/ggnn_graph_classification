package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int hh;
		int la;
		int lb;
		int ls;
		int same;
		int head;
		int end;
		int l;
		int sum;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ls = s.length();
		la = a.length();
		lb = b.length();
		hh = 0;
		sum = 0;
		for (i = 0;i < ls;i++)
		{
						  same = 0;
						  if ((s.charAt(i) == a.charAt(0)) && (i == 0 || s.charAt(i - 1) == ' '))
						  {
										 l = 1;
										 for (j = 1;j < la;j++)
										 {
														   if (a.charAt(j) != s.charAt(i + j))
														   {
																			same = 0;
																			break;
														   }
														   l++;
														   same = 1;
														   head = i;
														   end = i + la - 1;
										 }
						  }
						  if ((same == 1) && (i + la == ls || s.charAt(i + la) == ' '))
						  {
									   for (k = hh;k < head;k++)
									   {
									   System.out.printf("%c",s.charAt(k));
									   }
									   for (k = 0;k < lb;k++)
									   {
									   System.out.printf("%c",b.charAt(k));
									   }
									   hh = end + 1;
									   sum = 1;
						  }
		}
		if (sum == 0)
		{
					System.out.printf("%s",s);
		}
		if (sum == 1)
		{
					for (i = hh;i < ls;i++)
					{
					System.out.printf("%c",s.charAt(i));
					}
		}
		 return 0;
	}

}
