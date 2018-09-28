package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String c = new String(new char[10]);
		double n;
		int sum = 0;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T'))
			{
				System.out.print("error");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				sum++;
			}
		}
		if (b.charAt(i) != '\0')
		{
			System.out.print("error");
		}
		else
		{
			if ((double)sum / i > n)
			{
			System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;




	}
}

