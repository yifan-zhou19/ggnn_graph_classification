package <missing>;

public class GlobalMembers
{
	public static void Q(String a)
	{
		char c;
		c = a[0];
		int[] pos = new int[100];
		int i = 0;
		int num = 0;
		do
		{
			if (a[i].equals(c))
			{
				num++;
				pos[num] = i;
			}
			else
			{
				System.out.print(pos[num]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				num--;
			}
			i++;
		}while (i <= a.length() - 1);
	}
	public static int Main()
	{
		String children = new String(new char[100]);
		children = ConsoleInput.readToWhiteSpace(true).charAt(0);
		Q(children);
		return 0;
	}
}

