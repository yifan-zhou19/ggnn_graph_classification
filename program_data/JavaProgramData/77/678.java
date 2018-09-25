import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[200]);
	public static char u;
	public static char v;
	public static int n;
	public static int[][] t = new int[100][2];
	public static void disassemble(int x) //n????n??????????????�?�????????�?�??
	{
		int i;
		int m = 0;
		for (i = 0;i < 2 * n;i++)
		{
			if (str.charAt(i) == v)
			{
				m = i;
				t[x][1] = m; //x=1?????????????????????
				str = tangible.StringFunctions.changeCharacter(str, m, 1); //?????0,0???????????????????
				break;
			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			if (str.charAt(i) == u)
			{
				t[x][0] = i;
				str = tangible.StringFunctions.changeCharacter(str, i, 1);
				break;
			}
		}
		if (x != 1)
		{
			disassemble(x - 1);
		}
		System.out.print(t[n + 1 - x][0]);
		System.out.print(' ');
		System.out.print(t[n + 1 - x][1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			;
		}
		n = i / 2;
		u = str.charAt(0);
		v = str.charAt(i - 1);
		disassemble(n);
		return 0;
	}
}

