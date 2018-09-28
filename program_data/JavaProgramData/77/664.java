package <missing>;

public class GlobalMembers
{
	public static int play(int a, tangible.RefObject<Integer> blank1, int[] blank2, int bad)
	{
		if (blank2[a - 1] == -1 && bad == 0)
		{
			return a - 1;
		}
		else if (blank2[a - 1] == -1 && bad != 0)
		{
			return play(a - 1, blank1, blank2, bad - 1);
		}
		else
		{
			return play(a - 1, blank1, blank2, bad + 1);
		}
	}

	public static int Main()
	{
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] blank1 = new int[100];
		int[] blank2 = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(blank1,-1,99 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(blank2,-1,99 * (Integer.SIZE / Byte.SIZE));
		int w = 0;
		int j = 0;
		for (;w < 100;w++)
		{
			if (a.charAt(w) != a.charAt(0))
			{
				blank1[j] = w;
				blank2[w] = j;
				j++;
			}
		}
	if (j == 0)
	{
		System.out.print(j);
	}
	int i = 0;
		for (;i < j; i++)
		{
		tangible.RefObject<Integer> tempRef_blank1 = new tangible.RefObject<Integer>(blank1);
			System.out.print(play(blank1[i], tempRef_blank1, blank2, 0));
			blank1 = tempRef_blank1.argValue;
			System.out.print(' ');
			System.out.print(blank1[i]);
			System.out.print("\n");
		}
	if (i == 0)
	{
		System.out.print(i);
	}
	}
}

