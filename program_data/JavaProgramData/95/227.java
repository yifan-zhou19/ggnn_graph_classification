package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if ((s1.charAt(i) >= 'A') && (s1.charAt(i) <= 'Z'))
			{
				s1.charAt(i) += 32;
			}
		}
		for (j = 0;s2.charAt(j) != '\0';j++)
		{
			if ((s2.charAt(j) >= 'A') && (s2.charAt(j) <= 'Z'))
			{
				s2.charAt(j) += 32;
			}
		}
		if (strcmp(s1,s2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(s1,s2) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
	}


}

