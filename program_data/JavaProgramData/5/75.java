package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float rate;
		float rate0;
		int sum = 0;
		int len1;
		int len2;
		int i;
		int tag = 0;
		String base1 = new String(new char[501]);
		String base2 = new String(new char[501]);
		rate = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		base1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		base2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = base1.length();
		len2 = base2.length();
		if (len1 != len2)
		{
			tag = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto pku;
		}
		for (i = 0;i < len1;i++)
		{
			if (base1.charAt(i) != 'A' && base1.charAt(i) != 'T' && base1.charAt(i) != 'C' && base1.charAt(i) != 'G' || base2.charAt(i) != 'A' && base2.charAt(i) != 'T' && base2.charAt(i) != 'C' && base2.charAt(i) != 'G')
			{
				tag = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto pku;
			}
			if ((int)base1.charAt(i) == (int)base2.charAt(i))
			{
				sum++;
			}
			else
			{
				continue;
			}
		}
		rate0 = (float)sum / len1;
		if (rate0 > rate)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	pku:
	if (tag != 0)
	{
		System.out.print("error");
	}
		return 0;
	}
}

