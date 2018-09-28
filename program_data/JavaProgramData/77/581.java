import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int len;
	public static char a;
	public static char b;
	public static String ren = new String(new char[100]);
	public static void run(String ren)
	{
		int i;
		int j;
		for (i = 0; i < len; i++)
		{
			if (ren[i].equals(b))
			{
				for (j = i - 1; j >= 0; j--)
				{
					if (ren[j].equals(a))
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						ren[i] = null;
						ren[j] = null;
						break;
					}
				}
			}
		}
	}
	public static int Main()
	{
		ren = new Scanner(System.in).nextLine();
		len = ren.length();
		a = ren.charAt(0);
		b = ren.charAt(len - 1);
		run(ren);
		return 0;
	}

}
