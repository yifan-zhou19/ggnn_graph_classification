package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count = 0;
		for (int i = 1;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int j;
			if (a.charAt(0) != '_' && (a.charAt(0) < 65 || a.charAt(0)>122 || (a.charAt(0) > 90 && a.charAt(0) < 97))) //:????????????????
			{
				j = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto stop1;
			}
			for (j = 1;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) != '_' && (a.charAt(j) < 48 || (a.charAt(j)>57 && a.charAt(j) < 65) || (a.charAt(j)>90 && a.charAt(j) < 97) || a.charAt(j)>122)) //:?????????????????
				{
					break;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	stop1:
	if (j == a.length())
	{
				System.out.print("yes");
				System.out.print("\n");
				count++;
	}
			else
			{
				System.out.print("no");
				System.out.print("\n");
				count++;
			}
			if (count == n)
			{
				return 0;
			}
		}
		return 0;
	}

}

