package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[21]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s.charAt(0) != '_' && s.charAt(0) != 'A' && s.charAt(0) != 'B' && s.charAt(0) != 'C' && s.charAt(0) != 'D' && s.charAt(0) != 'E' && s.charAt(0) != 'F' && s.charAt(0) != 'G' && s.charAt(0) != 'H' && s.charAt(0) != 'I' && s.charAt(0) != 'J' && s.charAt(0) != 'K' && s.charAt(0) != 'L' && s.charAt(0) != 'M' && s.charAt(0) != 'N' && s.charAt(0) != 'O' && s.charAt(0) != 'P' && s.charAt(0) != 'Q' && s.charAt(0) != 'R' && s.charAt(0) != 'S' && s.charAt(0) != 'T' && s.charAt(0) != 'U' && s.charAt(0) != 'V' && s.charAt(0) != 'W' && s.charAt(0) != 'X' && s.charAt(0) != 'Y' && s.charAt(0) != 'Z' && s.charAt(0) != 'a' && s.charAt(0) != 'b' && s.charAt(0) != 'c' && s.charAt(0) != 'd' && s.charAt(0) != 'e' && s.charAt(0) != 'f' && s.charAt(0) != 'g' && s.charAt(0) != 'h' && s.charAt(0) != 'i' && s.charAt(0) != 'j' && s.charAt(0) != 'k' && s.charAt(0) != 'l' && s.charAt(0) != 'm' && s.charAt(0) != 'n' && s.charAt(0) != 'o' && s.charAt(0) != 'p' && s.charAt(0) != 'q' && s.charAt(0) != 'r' && s.charAt(0) != 's' && s.charAt(0) != 't' && s.charAt(0) != 'u' && s.charAt(0) != 'v' && s.charAt(0) != 'w' && s.charAt(0) != 'x' && s.charAt(0) != 'y' && s.charAt(0) != 'z')
			{
				System.out.print("no\n");

			}

			else
			{
			k = 0;
			for (j = 1;s.charAt(j) != '\0';j++)
			{
					if (s.charAt(j) != '_' && s.charAt(j) != 'A' && s.charAt(j) != 'B' && s.charAt(j) != 'C' && s.charAt(j) != 'D' && s.charAt(j) != 'E' && s.charAt(j) != 'F' && s.charAt(j) != 'G' && s.charAt(j) != 'H' && s.charAt(j) != 'I' && s.charAt(j) != 'J' && s.charAt(j) != 'K' && s.charAt(j) != 'L' && s.charAt(j) != 'M' && s.charAt(j) != 'N' && s.charAt(j) != 'O' && s.charAt(j) != 'P' && s.charAt(j) != 'Q' && s.charAt(j) != 'R' && s.charAt(j) != 'S' && s.charAt(j) != 'T' && s.charAt(j) != 'U' && s.charAt(j) != 'V' && s.charAt(j) != 'W' && s.charAt(j) != 'X' && s.charAt(j) != 'Y' && s.charAt(j) != 'Z' && s.charAt(j) != 'a' && s.charAt(j) != 'b' && s.charAt(j) != 'c' && s.charAt(j) != 'd' && s.charAt(j) != 'e' && s.charAt(j) != 'f' && s.charAt(j) != 'g' && s.charAt(j) != 'h' && s.charAt(j) != 'i' && s.charAt(j) != 'j' && s.charAt(j) != 'k' && s.charAt(j) != 'l' && s.charAt(j) != 'm' && s.charAt(j) != 'n' && s.charAt(j) != 'o' && s.charAt(j) != 'p' && s.charAt(j) != 'q' && s.charAt(j) != 'r' && s.charAt(j) != 's' && s.charAt(j) != 't' && s.charAt(j) != 'u' && s.charAt(j) != 'v' && s.charAt(j) != 'w' && s.charAt(j) != 'x' && s.charAt(j) != 'y' && s.charAt(j) != 'z' && s.charAt(j) != '0' && s.charAt(j) != '1' && s.charAt(j) != '2' && s.charAt(j) != '3' && s.charAt(j) != '4' && s.charAt(j) != '5' && s.charAt(j) != '6' && s.charAt(j) != '7' && s.charAt(j) != '8' && s.charAt(j) != '9')
					{
							k++;
					}

			}
			if (k == 0)
			{
			  System.out.print("yes\n");
			}
			else
			{
			  System.out.print("no\n");
			}

			}
		}

	return 0;
	}


}

