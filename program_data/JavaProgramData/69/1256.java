import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[1000]);
		String b1 = new String(new char[1000]);
		int[] a = new int[1000];
		int[] b = new int[1000];
		a1 = new Scanner(System.in).nextLine();
		b1 = new Scanner(System.in).nextLine();
		for (int i = 0;i < a1.length();i++)
		{
			a[i] = (int)a1.charAt(a1.length() - i - 1) - 48;
		}
		for (int i = 0;i < b1.length();i++)
		{
			b[i] = (int)b1.charAt(b1.length() - i - 1) - 48;
		}
		for (int i = 0;i < 1000;i++)
		{
			if (a[i] + b[i] < 10)
			{
				a[i] += b[i];
			}
			else
			{
				a[i + 1] += (a[i] + b[i]) / 10;
				a[i] = (a[i] + b[i]) % 10;
			}
		}
		int t = -1;
		for (int i = 999;i >= 0;i--)
		{
			if (a[i] == 0)
			{
				continue;
			}
			else
			{
				t = i;
				break;
			}
		}
		if (t == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
		for (int i = t;i >= 0;i--)
		{
				System.out.print(a[i]);
		}
		System.out.print("\n");
		}


		return 0;
	}
}
