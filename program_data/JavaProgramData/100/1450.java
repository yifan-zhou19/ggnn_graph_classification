package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[52]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,temp=0;
		int i;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < 52;i++)
		{
			b = b.substring(0, i);
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				b.charAt(a.charAt(i) - 65) += 1;
			}
			else if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				b.charAt(a.charAt(i) - 71) += 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b.charAt(i) != null)
			{
			System.out.printf("%c=%d\n",i + 65,b.charAt(i));
			temp = 1;
			}
		}
		for (i = 26;i < 52;i++)
		{
			if (b.charAt(i) != null)
			{
			System.out.printf("%c=%d\n",i + 71,b.charAt(i));
			temp = 1;
			}
		}
		if (temp == 0)
		{
			System.out.print("No");
		}
	}

}

