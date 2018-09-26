import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static void judge(int left,int right)
	{
		for (int i = left;i <= right;i++)
		{
			if (a.charAt(i) != a.charAt(right + left - i))
			{
				return;
			}
		}
		for (int i = left;i <= right;i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		return;
	}



	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (int j = 1;j <= len - 1;j++)
		{
			for (int i = 0;i < len - 1;i++)
			{

					if (i + j <= len - 1)
					{
						judge(i, i + j);
					}
			}
		}
	return 0;
	}

}
