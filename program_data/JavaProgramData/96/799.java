package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String cs = new String(new char[102]);
	int ys = 0;
	int c = 0;
	int s;
	cs = new Scanner(System.in).nextLine();
	for (int i = 0;i < cs.length();i++)
	{
		 c = 10 * ys + (int)(cs.charAt(i) - '0');
		 ys = c % 13;
		 s = c / 13;
		if (s != 0)
		{
		   System.out.printf("%d",s);
		}
		else
		{
			if (i == 0)
			{
				if (cs.length() == 1)
				{
				System.out.printf("%d",s);
				}
				else
				{
				 continue;
				}
			}
			else if (i == 1)
			{
			   if (cs.length() > 2)
			   {
				continue;
			   }
				else
				{
				 System.out.printf("%d",s);
				}
			}
		   else
		   {
			 System.out.printf("%d",s);
		   }
		}
		 if (i == cs.length() - 1)
		 {
		   System.out.print("\n");
		   System.out.printf("%d",ys);
		 }
	}
	return 0;
	}
}
