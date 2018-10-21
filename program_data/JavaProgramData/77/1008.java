package <missing>;

public class GlobalMembers
{
	public static String dui = new String(new char[150]);
	public static char nan;
	public static char nv;
	public static char dis;



	public static int Main()
	{
		void deleted();
	void peidui(int * left, int * right);
	int iter;
	int index;
	int left;
	int right;
	   dui = new Scanner(System.in).nextLine();
		nan = dui.charAt(0);
		index = 1;
		while (dui.charAt(index) != '\0')
		{
			if (dui.charAt(index) != nan)
			{
				nv = dui.charAt(index);
				break;
			}
			index++;
		}
		deleted();
		index = dui.length() / 2;
		for (iter = 0 ; iter != index ; ++iter)
		{
		tangible.RefObject<Integer> tempRef_left = new tangible.RefObject<Integer>(left);
		tangible.RefObject<Integer> tempRef_right = new tangible.RefObject<Integer>(right);
			peidui(tempRef_left, tempRef_right);
			right = tempRef_right.argValue;
			left = tempRef_left.argValue;
			System.out.printf("%d %d\n",left,right);
		}
		return 0;
	}

	public static void deleted()
	{
		if ('#' != nan && '#' != nv)
		{
			dis = '#';
		}
		else if ('@' != nan && '@' != nv)
		{
			dis = '@';
		}
		else if ('$' != nan && '$' != nv)
		{
			dis = '$';
		}
	}

	public static void peidui(tangible.RefObject<Integer> left, tangible.RefObject<Integer> right)
	{
		int index = 0;
		int boysready = 0;
		while (dui.charAt(index) != '\0')
		{
			if (dui.charAt(index) == nan)
			{
				boysready = 1;
				left.argValue = index;
			}
			else if (dui.charAt(index) == nv)
			{
				if (boysready != 0)
				{
					right.argValue = index;
					break;
				}
			}
			index++;
		}
		dui = tangible.StringFunctions.changeCharacter(dui, left.argValue, dui[right.argValue] = dis);
	}
}

