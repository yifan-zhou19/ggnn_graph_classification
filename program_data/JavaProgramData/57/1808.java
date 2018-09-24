package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int zzz;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[30]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			if (a.charAt(len - 1) == 'g')
			{
				zzz = len - 4;
			}
			else
			{
				zzz = len - 3;
			}
			for (m = 0;m <= zzz;m++)
			{
				System.out.printf("%c",a.charAt(m));
			}
			System.out.print("\n");
		}

		return 0;
	}
}

