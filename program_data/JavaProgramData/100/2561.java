package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String a = new String(new char[300]);
		int[] b = new int[300];
		int i;
		int d;
		int sign = 0;
		for (i = 0;i <= 299;i++)
		{
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		d = a.length();
		for (i = 0;i < d;i++)
		{
			if ((a.charAt(i) - 65 >= 0 && a.charAt(i) - 90 <= 0) || (a.charAt(i) - 97 >= 0 && a.charAt(i) - 122 <= 0))
			{
				b[a.charAt(i)] += 1;
			}
		}
		for (i = 1;i <= 299;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i,b[i]);
				sign = 1;
			}
		}
		if (sign == 0)
		{
	System.out.print("No");
		}


			return 0;










	}
}

