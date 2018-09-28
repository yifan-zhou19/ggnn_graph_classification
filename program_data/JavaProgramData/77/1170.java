package <missing>;

public class GlobalMembers
{
	public static void p(int[] a) //??
	{
		int i = 0;
		for (i = 0;a[i] != 0;i++)
		{
			if (a[i] == 1)
			{
				int j = i + 1;
				while (a[j] == 3)
				{
					j++; //?????????????
				}
				if (a[j] == 2)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
					a[i] = 3;
					a[j] = 3; //??????
					p(a); //???
				}
			}
		}
	}
	public static int Main()
	{
		char a;
		int[] child = new int[200];
		int i = 1;
		child[0] = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (cin.peek() != '\n') //?????????1???2???0????3????
		{
			char ch = System.in.read();
			if (ch == a)
			{
				child[i] = 1;
			}
			else
			{
				child[i] = 2;
			}
			i++;
		}
		p(child);
		return 0;
	}
}

