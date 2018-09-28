package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String first = new String(new char[1024]);
		String second = new String(new char[1024]);
		float rate = 0.0f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			first = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			second = tempVar3.charAt(0);
		}

		int n1 = first.length();
		int n2 = second.length();

		if (n1 != n2)
		{
			System.out.print("error");
			return 0;
		}

		for (int i = 0; i < n1; ++i)
		{
			if (first.charAt(i) != 'A' && first.charAt(i) != 'T' && first.charAt(i) != 'C' && first.charAt(i) != 'G' && second.charAt(i) != 'A' && second.charAt(i) != 'T' && second.charAt(i) != 'C' && second.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}

		int same = 0;
		for (int i = 0; i < n1; ++i)
		{
			if (first.charAt(i) == second.charAt(i))
			{
				same++;
			}
		}

		float actual = (float)same / (float)n1;
		if (actual >= rate)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}
}

