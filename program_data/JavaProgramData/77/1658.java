package <missing>;

public class GlobalMembers
{
	public static int boy = 0;
	public static int[][] children = new int[100][2];
	public static int childnum = 0;
	public static int theboy;
	public static void findpair(char boysign)
	{
		if (boy == -1)
		{
			return;
		}
		char sign;
		sign = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (sign == boysign)
		{
			boy++;
			childnum++;
			children[childnum][0] = 0;
			findpair(boysign);
			return;
		}
		else
		{
			childnum++;
			children[childnum][0] = 1;
			for (int i = childnum; ;i--)
			{
				if (children[i][0] == 0 && children[i][1] != 0)
				{
					theboy = i;
					children[i][1] = 0;
					break;
				}
			}
			System.out.print(theboy);
			System.out.print(' ');
			System.out.print(childnum);
			System.out.print("\n");
			boy--;
			findpair(boysign);
			return;
		}
	}
	public static int Main()
	{
		for (int i = 0;i < 100;i++)
		{
			children[i][1] = 1;
		}
		char boysign;
		boysign = ConsoleInput.readToWhiteSpace(true).charAt(0);
		findpair(boysign);
		return 0;
	}
}

