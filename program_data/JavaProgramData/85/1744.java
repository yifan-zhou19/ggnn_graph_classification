package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[50]);
		int i;
		int j;
		int mark;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			mark = 0;
			s = new Scanner(System.in).nextLine();
			len = s.length();
			if ((s.charAt(0) == 95) || (s.charAt(0) >= 65 && s.charAt(0) <= 90) || (s.charAt(0) >= 97 && s.charAt(0) <= 122))
			{
				mark = mark;
			}
			else
			{
				  System.out.print("no\n");
				  continue;
			}
			for (j = 1;j < len;j++)
			{
				if ((s.charAt(j) == 95) || (s.charAt(j) >= 65 && s.charAt(j) <= 90) || (s.charAt(j) >= 97 && s.charAt(j) <= 122) || (s.charAt(j) >= 48 && s.charAt(j) <= 57))
				{
					mark = mark;
				}
				else
				{
					mark = mark + 1;
				}
			}
			if (mark == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}

		}
		return 0;

	}

}

