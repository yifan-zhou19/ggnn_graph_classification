import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[300]);
		String str2 = new String(new char[300]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int[] a = new int[300];
		int[] a1 = new int[300];
		int[] a2 = new int[300];
		int t1;
		int t2;
		t1 = str1.length();
		t2 = str2.length();
		for (int i = 0;i < t1;i++)
		{
		a1[t1 - 1 - i] = (int)(str1.charAt(i) - '0');
		}
		for (int i = 0;i < t2;i++)
		{
		a2[t2 - 1 - i] = (int)(str2.charAt(i) - '0');
		}
		for (int i = 0;i < 300;i++)
		{
			a[i] = a1[i] + a2[i];
		}
		for (int i = 0;i < 299;i++)
		{
			a[i + 1] += a[i] / 10;
			a[i] = a[i] % 10;
		}
		int j;
		for (j = 299;j >= 0;j--)
		{
			if (a[j] != 0)
			{
			break;
			}
		}
		if (j == -1)
		{
		System.out.print(a[0]);
		System.out.print("\n");
		}
		else
		{
		for (int i = j;i >= 0;i--)
		{
		System.out.print(a[i]);
		}
		System.out.print("\n");
		}

		return 0;
	}

}
