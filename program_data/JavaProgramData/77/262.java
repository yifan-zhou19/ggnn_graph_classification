import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void solve(String str, char m, char f)
	{
		int l;
		int flag = 1;
		int i;
		int k;
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (str[i].equals(m) || str[i].equals(f))
			{
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			return;
		}
		for (i = 0;i < l;i++)
		{
			if (flag == 1 && str[i].equals(f))
			{
				System.out.print(k);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				flag = 0;
				str[k] = ' ';
				str[i] = ' ';
				break;
			}
			if (str[i].equals(m))
			{
				flag = 1;
				k = i;
			}
			if (str[i].equals(f))
			{
				flag = 0;
			}
		}
		solve(str, m, f);
	}
	public static int Main()
	{
		String str = new String(new char[100]);
		char m;
		char f;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		m = str.charAt(0);
		for (p = str;p < str + str.length();p++)
		{
			if (*p != m)
			{
				f = p;
				break;
			}
		}
		solve(str, m, f);
		return 0;
	}
}
