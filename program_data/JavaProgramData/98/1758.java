package <missing>;

public class GlobalMembers
{
	public static int length(tangible.RefObject<String> p)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = p.argValue;
		int i = 0;
		for (;;)
		{
			if (*p2++== 0)
			{
				break;
			}
			i++;
		}
		return i;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[1000][41];
		for (int i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		String p1 = word[0];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = null;
		for (p2 = p1; p1 <= word[n - 1]; p1 = p2 + 41)
		{
			p2 = p1;
			for (int s = -1; s <= 80; p2 += 41)
			{
				if (p2 == word[n])
				{
					p2 += 41;
					break;
				}
			tangible.RefObject<String> tempRef_p2 = new tangible.RefObject<String>(p2);
				s += length(tempRef_p2);
				p2 = tempRef_p2.argValue;
				s++;
			}
			p2 -= 82;
			System.out.print(p1);
			for (char * p3 = p1.Substring(41); p3 <= p2; p3 += 41)
			{
				System.out.print(" ");
				System.out.print(p3);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

