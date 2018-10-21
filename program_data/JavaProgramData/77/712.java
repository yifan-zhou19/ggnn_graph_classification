import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static char boy;
	public static char girl;
	public static void search(String a)
	{
		int j = 0;
		int k;
		int bo;
		int gi;
		if (!a[0].equals('.'))
		{
			while (!a[j].equals(girl))
			{
				j++;
			}
			k = j - 1;
			gi = j;
			a[gi] = '.';
			while (a[k].equals('.'))
			{
				k--;
			}
			a[k] = '.';
			bo = k;
			System.out.print(bo);
			System.out.print(" ");
			System.out.print(gi);
			System.out.print("\n");
			search(a);
		}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			i++;
		}
		boy = a.charAt(0);
		girl = a.charAt(i - 1);
		search(a);
		return 0;
	}
}
