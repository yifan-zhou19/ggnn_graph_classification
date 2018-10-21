public class note
{
	public int know;
	public int known;
}

package <missing>;

public class GlobalMembers
{
	public static note[] men = tangible.Arrays.initializeWithDefaultnoteInstances(10010);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			men[i].know++;
			men[j].known++;
			if (men[j].known == n - 1 && men[j].know != n)
			{
				System.out.print(j);
				flag = 1;
			}
			if (men[i].known == n - 1 && men[i].know != n)
			{
				System.out.print(i);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

