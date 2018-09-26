import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
	String a = new String(new char[100]);
	a = new Scanner(System.in).nextLine();
	n = a.length();
	int[] b = new int[n];
	for (i = 0;i < n;i++)
	{
	b[i] = a.charAt(i) - 48;
	}
	if (n == 1)
	{
	System.out.print(0);
	System.out.print("\n");
	System.out.print(b[0]);
	}
	else if (n == 2 && (b[0] * 10 + b[1] < 13))
	{
		System.out.print(0);
		System.out.print("\n");
		System.out.print(b[0]);
		System.out.print(b[1]);
	}
	else
	{
		for (i = 0;i < n - 1;i++)
		{
		k = (b[i] * 10 + b[i + 1]) / 13;
	if (!((k == 0) && (i == 0)))
	{
	System.out.print(k);
	}
	b[i + 1] = b[i] * 10 + b[i + 1] - 13 * k;
		}
	System.out.print("\n");
	System.out.print(b[n - 1]);
	}
	return 0;
	}
}
