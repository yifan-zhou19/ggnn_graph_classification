package <missing>;

public class GlobalMembers
{
	public static int len;
	public static String ren = new String(new char[100]);
	public static void search(String ren, int k)
	{
		int i;
		if (k == len - 1)
		{
			System.out.print(0);
			System.out.print(" ");
			System.out.print(len - 1);
			return;
		}
		if (ren[k].equals(ren[len - 1]))
		{
			for (i = k - 1; i >= 0; i--)
			{
				if (ren[i].equals(ren[0]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(k);
					System.out.print("\n");
					ren[i] = null;
					ren[k] = null;
					break;
				}
			}
				search(ren, k + 1);
		}
		else
		{
			search(ren, k + 1);
		}
	}
	public static int Main()
	{
		ren = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = ren.length();
		search(ren, 0);
		return 0;
	}

}

