package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t = 0;
		int s = 0;
		float n;
		String a = new String(new char[600]);
		String b = new String(new char[600]);
		n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'T' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'T' && b.charAt(i) != 'G'))
				{
					t++;
				}
			}

			if (t > 0)
			{
			System.out.print("error");
			System.out.print("\n");
			}
			else
			{

				   for (i = 0;i < a.length();i++)
				   {
					if (a.charAt(i) == b.charAt(i))
					{
						s++;
					}
				   }

				   if ((float)s / a.length() > n)
				   {
					   System.out.print("yes");
				   }
				   else
				   {
					   System.out.print("no");
				   }
			}
		}
		 return 0;

	}
}

