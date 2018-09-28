package <missing>;

public class GlobalMembers
{
	public static int f(char x,char y)
	{
		if (x == y)
		{
			return 1;
		}
	   else
	   {
		   return 0;
	   }
	}

	public static int Main()
	{
		double r;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		int len1;
		int len2;
		int i;
		int count = 0;
		len1 = str1.length();
		len2 = str2.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;str1.charAt(i) != 0;i++)
		{
			if ((str1.charAt(i) != 'A' && str1.charAt(i) != 'C' && str1.charAt(i) != 'G' && str1.charAt(i) != 'T') || (str2.charAt(i) != 'A' && str2.charAt(i) != 'C' && str2.charAt(i) != 'G' && str2.charAt(i) != 'T'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;str1.charAt(i) != 0;i++)
		{
			 if (f(str1.charAt(i), str2.charAt(i)) == 1)
			 {
					count++;
			 }
		}
		x = 1.0 * count / len1;
		if (x > r)
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

