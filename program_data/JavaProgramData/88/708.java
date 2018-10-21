import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String p = new String(new char[30]);
	public static int l; //???t????????p?ascll?
	public static int i;
	public static int j;
	public static int[] t = new int[30];
	public static int Main()
	{
		p = new Scanner(System.in).nextLine(); //????
		l = p.length(); //l???
		for (i = 0; i < l; i++)
		{
			t[i] = (p.Substring(i));
			if (t[i] < 58 && t[i] >= 48)
			{
				if (t[i - 1] != 45)
				{
					t[i] = (t + i) - 48;
				}
			} //??????????
			else
			{
				t[i] = 32;
			} //??????????32
		}
		i = 0; //i???
		while (i < l)
		{
			if (t[i] != 32)
			{
				System.out.print((t + i));
			} //??32?????
			else if (t[i] == 32)
			{
				System.out.print("\n");
				for (j = i; j < l; j++)
				{
					if (t[j] != 32)
					{
						i = j - 1;
						break;
					} //??????????????32?????
				}
			}
			i = i + 1; //????
		}
		return 0;
	} //?????


}
