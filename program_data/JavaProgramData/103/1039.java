package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int n;
		int i = 0;
		int j;
		int[] a = new int[1000];
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (j = 0;j < n;j++)
		{
			if (c.charAt(j) > 96)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j) - 32);
			}
		}
		while (i < n)
		{
		for (j = 0;j < n - i;j++)
		{
			if (c.charAt(i) == c.charAt(i + j))
			{
				a[i]++;
				if (i + j == n - 1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
			else
			{
				i = i + j;
				break;
			}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = 0;i < n;i++)
	{
		if (a[i] != 0)
		{
			System.out.printf("(%c,%d)",c.charAt(i),a[i]);
		}
	}
		return 0;
	}









}

