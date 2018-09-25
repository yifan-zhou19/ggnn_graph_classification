package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[201]);
	public static int[] flag = new int[101];
	public static int i;
	public static int k;
	public static int length;
	public static char a; //??????
	public static char b;
	public static void f(String s, int l)
	{
		if (l <= k)
		{
			for (i = flag[l]; i >= 0; i--)
			{
				if (s[i].equals(a))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(flag[l]);
					System.out.print("\n");
					s[i] = '\0';
					s[flag[l]] = '\0'; //??
					break;
				}
			}
			f(s, l + 1); //??
		}
		else
		{
		return;
		}
	}
	public static int Main()
	{
		int j = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = str.length(); //????????
		a = str.charAt(0);
		b = str.charAt(length - 1); //????????a,b
		for (i = 1; i <= length - 1; i++)
		{
			if (str.charAt(i) == b)
			{
				j++;
				flag[j] = i;
			}
		}
		k = j; //???????k
		f(str, 1);
		return 0;
	}

}

