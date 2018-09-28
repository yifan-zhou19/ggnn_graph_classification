package <missing>;

public class GlobalMembers
{
	public static int[] shuzu1 = new int[10];
	public static int[] shuzu2 = new int[10];
	public static int n1;
	public static int n2;
	public static void input() //??
	{
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n1;i++)
		{
			shuzu1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n2;i++)
		{
			shuzu2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void sort(int[] shuzu, int bg, int ed) //???????????
	{
		int bg1 = bg;
		int ed1 = ed;
		int key = shuzu[bg];
		if (bg1 != ed1)
		{
			while (bg1 != ed1)
			{
				for (;shuzu[ed1] >= key != 0 && bg1 != ed1;ed1--)
				{
					;
				}
				shuzu[bg1] = shuzu[ed1];
				if (bg1 == ed1)
				{
					break;
				}
				bg1++;
				for (;shuzu[bg1] <= key != 0 && bg1 != ed1;bg1++)
				{
					;
				}
				shuzu[ed1] = shuzu[bg1];
				if (bg1 == ed1)
				{
					break;
				}
				ed1--;
			}
			shuzu[bg1] = key;
			if (bg1 != bg)
			{
				sort(shuzu, bg, bg1 - 1);
			}
			if (ed1 != ed)
			{
				sort(shuzu, ed1 + 1, ed);
			}
		}
	}
	public static void sort1() //????
	{
		sort(shuzu1, 0, n1 - 1); //?2???????
		sort(shuzu2, 0, n2 - 1);
	}
	public static void link()
	{
		int lk; //??2??
		for (lk = 0;lk < n2;lk++)
		{
			shuzu1[n1 + lk] = shuzu2[lk];
		}
	}
	public static void output() //????
	{
		int i;
		for (i = 0;i < n1 + n2;i++)
		{
			if (i != 0)
			{
				System.out.print(' ');
			}
			System.out.print(shuzu1[i]);
		}
	}
	public static int Main()
	{
		input();
		sort1();
		link();
		output();
		return 0;
	}


}

