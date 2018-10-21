package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		int k;
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
			   for (int j = i;j < a.length();j++)
			   {
				if (a.charAt(j) < '0' || a.charAt(j)>'9')
				{
				   System.out.print("\n");
				   break;
				}
				System.out.print(a.charAt(j));
				k = j;
			   }
			 i = k;
			}
		}
	   return 0;
	}

}
