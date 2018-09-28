package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		int count = 0;
		double rate;
		String str1 = new String(new char[LEN]);
		String str2 = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		l1 = str1.length();
		l2 = str2.length();
		if (l1 != l2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < l1;i++)
		{
			if (str1.charAt(i) == str2.charAt(i))
			{
				count++;
			}
			if (((str1.charAt(i) != 'A') && (str1.charAt(i) != 'C') && (str1.charAt(i) != 'G') && (str1.charAt(i) != 'T')) || ((str2.charAt(i) != 'A') && (str2.charAt(i) != 'C') && (str2.charAt(i) != 'G') && (str2.charAt(i) != 'T')))
			{
				System.out.print("error");
				return 0;
			}
		}
		if ((1.00 * count / l1) >= rate)
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

