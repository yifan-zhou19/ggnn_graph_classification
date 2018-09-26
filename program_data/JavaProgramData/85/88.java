package <missing>;

public class GlobalMembers
{
	public static int legal(String s)
	{
		int i;

		if ((s[0].compareTo('a') >= 0 && s[0].compareTo('z') <= 0) || (s[0].compareTo('A') >= 0 && s[0].compareTo('Z') <= 0) || s[0].equals('_'))
		{
			for (i = 0; !s[i].equals('\0');i++)
			{
				if (!((s[i].compareTo('a') >= 0 && s[i].compareTo('z') <= 0) || (s[i].compareTo('A') >= 0 && s[i].compareTo('Z') <= 0) || s[i].equals('_') || (s[i].compareTo('0') >= 0 && s[i].compareTo('9') <= 0)))
				{

				return 0;
				}
			}
			return 1;
		}
		else
		{
			return 0;
		}

	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			String s = new String(new char[20]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (legal(s) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}


}

