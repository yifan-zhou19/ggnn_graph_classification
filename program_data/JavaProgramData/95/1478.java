import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		int l;
		int t = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		s1 = new Scanner(System.in).nextLine();

		s2 = new Scanner(System.in).nextLine();
		l = s1.length();
		for (int i = 0;i < l;i++)
		{
				a[i] = s1.charAt(i);
			if (a[i] > 64 && a[i] < 91)
			{
				a[i] = a[i] + 32;
			}

			b[i] = s2.charAt(i);
			if (b[i] > 64 && b[i] < 91)
			{
				b[i] = b[i] + 32;
			}
			i++;
		}
		for (int j = 0;j < l;j++)
		{
			if (a[j] > b[j])
			{
				System.out.print(">");
				System.out.print("\n");
				t++;
				break;
			}
			else if (a[j] < b[j])
			{
				System.out.print("<");
				System.out.print("\n");
				t++;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}
}
