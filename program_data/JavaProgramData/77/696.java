package <missing>;

public class GlobalMembers
{
	public static String dui = new String(new char[1000]);
	public static int i = -1;
	public static int p = 0;
	public static int[] flag = new int[100];
	public static void rankgame(int s)
	{
		if (i + 1 == p && p != 0)
		{
			return;
		}
		cin.get(dui.charAt(s));
		i++;
		if (dui.charAt(s) != dui.charAt(0))
		{
			System.out.print(flag[s - 1]);
			System.out.print(' ');
			System.out.print(i);
			System.out.print("\n");
			p = p + 2;
			rankgame(s - 1);
		}
		else
		{
			flag[s] = i;
			s++;
			rankgame(s);
		}
	}


	public static int Main()
	{
		rankgame(0);
		return 0;
	}


}
