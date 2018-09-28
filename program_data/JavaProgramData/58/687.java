package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[100]);
		n = new Scanner(System.in).nextLine();
		int m = Integer.parseInt(n);
		for (int j = 0;j < m;j++)
		{
				int bar = 0;
				String a = new String(new char[100]);
				a = new Scanner(System.in).nextLine();
				int len = a.length();
				if ((a.charAt(0) <= 90 && a.charAt(0) >= 65) || a.charAt(0) == 95 || (a.charAt(0) >= 97 && a.charAt(0) <= 122))
				{
							for (int i = 0;i < len && bar == 0;i++)
							{
										  if ((a.charAt(i) < 65 && a.charAt(i)>57) || a.charAt(i) < 48 || (a.charAt(i)>90 && a.charAt(i) < 97 && a.charAt(i) != 95) || a.charAt(i)>122)
										  {
												   bar = 1;
										  }
							}
							if (bar == 1)
							{
									   bar = 0;
							}
							else if (bar == 0)
							{
									   bar = 1;
							}
				}
				if (bar == 0)
				{
					 System.out.print("0\n");
				}
				if (bar == 1)
				{
					 System.out.print("1\n");
				}
		}
		return 0;
	}



}
