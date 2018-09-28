package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String p;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		p = a;
		System.out.print("\n");
		num = len;
		System.out.print(p);
		for (int i = 1;i < n;i++)
		{
					   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
					   int len = a.length();
					   p = a;
					   if (num + len + 1 > 80)
					   {
						   System.out.print("\n");
						   num = len;
						   System.out.print(p);
					   }
					   else
					   {
						   num += len + 1;
						   System.out.print(' ');
						   System.out.print(p);
					   }
		}

		return 0;
	}


}

