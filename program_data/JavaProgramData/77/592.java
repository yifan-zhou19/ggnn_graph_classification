import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void f(String a, char b, char g, int len, int k)
	{
		int i;
		int j;

		while (k < len - 1)
		{
		for (i = k;i < len;i++)
		{
			if (a[i].equals(g))
			{
				break;
			}
		}

		for (j = i - 1;j > 0;j--)
		{
			if (a[j].equals(b))
			{
				break;
			}
		}
		if (i == len)
		{
			break;
		}
		System.out.print(j);
		System.out.print(" ");
		System.out.print(i);
		System.out.print("\n");
		a[i] = ' ';
		a[j] = ' ';
		f(a, b, g, len, i + 1);
		}



	}
	public static int Main()
	{
		String a = new String(new char[1000]);
		char b;
		char g;
		int len;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		b = a.charAt(0);
		g = a.charAt(len - 1);
		f(a, b, g, len, k);
		return 0;
	}


}
