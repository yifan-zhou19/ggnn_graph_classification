package <missing>;

public class GlobalMembers
{
	public static String n = new String(new char[101]);
	public static int[] a = new int[101];
	public static int fig = 0;
	public static int l;
	public static void calculate()
	{
		int i;
		int j;
		int yu = 0;
		for (i = 1;i < l;i++)
		{
			fig = fig * 10 + ((int)n.charAt(i) - '0');
			a[i] = fig / 13;
			fig = fig - 13 * a[i];
		}
		for (i = 1;i < l;i++)
		{
			if (a[i] != 0)
			{
				j = i;
				break;
			}
		}
		for (i = j;i < l;i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		System.out.print(fig);
		System.out.print("\n");
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(n,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = n.length();
		fig = ((int)n.charAt(0) - '0');
		if ((l == 2 && (fig * 10 + (int)n.charAt(1) - '0') < 13) || (l == 1))
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(n);
			System.out.print("\n");
		}
		else
		{
			calculate();
		}
		return 0;
	}
}

