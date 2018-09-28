package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String p = null;
		int i;
		int len = 0;
		int l;
		int n;
		int num = 0;
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{

			l = a.length();
			num++;
			len += l;
			if (len > 80)
			{
				System.out.print("\n");
				len = l;
				num = 1;
			}
			else if (num != 1)
			{
				System.out.print(' ');
			}
			for (i = 0; i < l; i++)
			{
				System.out.print((p.Substring(i)));
			}
			len++;
		}
		return 0;
	}

}

