package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String c = new String(new char[85]);
		char t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = System.in.read();
		for (i = 1; i <= n; i++)
		{
			j = 0;
			c = tangible.StringFunctions.changeCharacter(c, 0, System.in.read());
			while ((c.charAt(j) - '\n') != 0)
			{
				j++;
				c = tangible.StringFunctions.changeCharacter(c, j, System.in.read());
			}
			if (c.charAt(0) != '_' && c.charAt(0) != 'a' && c.charAt(0) != 'b' && c.charAt(0) != 'c' && c.charAt(0) != 'd' && c.charAt(0) != 'e' && c.charAt(0) != 'f' && c.charAt(0) != 'g' && c.charAt(0) != 'h' && c.charAt(0) != 'i' && c.charAt(0) != 'j' && c.charAt(0) != 'k' && c.charAt(0) != 'l' && c.charAt(0) != 'm' && c.charAt(0) != 'n' && c.charAt(0) != 'o' && c.charAt(0) != 'p' && c.charAt(0) != 'q' && c.charAt(0) != 'r' && c.charAt(0) != 's' && c.charAt(0) != 't' && c.charAt(0) != 'u' && c.charAt(0) != 'v' && c.charAt(0) != 'w' && c.charAt(0) != 'x' && c.charAt(0) != 'y' && c.charAt(0) != 'z' && c.charAt(0) != 'A' && c.charAt(0) != 'B' && c.charAt(0) != 'C' && c.charAt(0) != 'D' && c.charAt(0) != 'E' && c.charAt(0) != 'F' && c.charAt(0) != 'G' && c.charAt(0) != 'H' && c.charAt(0) != 'I' && c.charAt(0) != 'J' && c.charAt(0) != 'K' && c.charAt(0) != 'L' && c.charAt(0) != 'M' && c.charAt(0) != 'N' && c.charAt(0) != 'O' && c.charAt(0) != 'P' && c.charAt(0) != 'Q' && c.charAt(0) != 'R' && c.charAt(0) != 'S' && c.charAt(0) != 'T' && c.charAt(0) != 'U' && c.charAt(0) != 'V' && c.charAt(0) != 'W' && c.charAt(0) != 'X' && c.charAt(0) != 'Y' && c.charAt(0) != 'Z')
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				for (k = 1; k < j; k++)
				{
					if (c.charAt(k) != '_' && c.charAt(k) != 'a' && c.charAt(k) != 'b' && c.charAt(k) != 'c' && c.charAt(k) != 'd' && c.charAt(k) != 'e' && c.charAt(k) != 'f' && c.charAt(k) != 'g' && c.charAt(k) != 'h' && c.charAt(k) != 'i' && c.charAt(k) != 'j' && c.charAt(k) != 'k' && c.charAt(k) != 'l' && c.charAt(k) != 'm' && c.charAt(k) != 'n' && c.charAt(k) != 'o' && c.charAt(k) != 'p' && c.charAt(k) != 'q' && c.charAt(k) != 'r' && c.charAt(k) != 's' && c.charAt(k) != 't' && c.charAt(k) != 'u' && c.charAt(k) != 'v' && c.charAt(k) != 'w' && c.charAt(k) != 'x' && c.charAt(k) != 'y' && c.charAt(k) != 'z' && c.charAt(k) != 'A' && c.charAt(k) != 'B' && c.charAt(k) != 'C' && c.charAt(k) != 'D' && c.charAt(k) != 'E' && c.charAt(k) != 'F' && c.charAt(k) != 'G' && c.charAt(k) != 'H' && c.charAt(k) != 'I' && c.charAt(k) != 'J' && c.charAt(k) != 'K' && c.charAt(k) != 'L' && c.charAt(k) != 'M' && c.charAt(k) != 'N' && c.charAt(k) != 'O' && c.charAt(k) != 'P' && c.charAt(k) != 'Q' && c.charAt(k) != 'R' && c.charAt(k) != 'S' && c.charAt(k) != 'T' && c.charAt(k) != 'U' && c.charAt(k) != 'V' && c.charAt(k) != 'W' && c.charAt(k) != 'X' && c.charAt(k) != 'Y' && c.charAt(k) != 'Z' && c.charAt(k) != '0' && c.charAt(k) != '1' && c.charAt(k) != '2' && c.charAt(k) != '3' && c.charAt(k) != '4' && c.charAt(k) != '5' && c.charAt(k) != '6' && c.charAt(k) != '7' && c.charAt(k) != '8' && c.charAt(k) != '9')
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
				}
				if (k == j)
				{
					System.out.print("1");
					System.out.print("\n");
				}
			}
		}
			 return 0;
	}
}

