import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int[] at = new int[200];
		int[] bt = new int[200];
		int[] ans = new int[201];
		int i;
		int j;
		int A;
		int B;
		int max = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		A = a.length();
		B = b.length();
		for (i = 0; i < A; i++)
		{
			at[i] = a.charAt(A - i - 1) - '0';
		}
		for (i = 0; i < B; i++)
		{
			bt[i] = b.charAt(B - i - 1) - '0';
		}
		if (A > B)
		{
			max = A;
			for (i = B; i < A; i++)
			{
				bt[i] = 0;
			}
		}
		else if (B > A)
		{
				max = B;
				for (i = A; i < B; i++)
				{
					at[i] = 0;
				}
		}
			else
			{
				max = A;
			}

		for (i = 0; i < max; i++)
		{
			ans[i] = ans[i] + at[i] + bt[i];
			if (ans[i] >= 10)
			{
				ans[i] = ans[i] - 10;
				ans[i + 1]++;
			}
		}
		for (i = max; i >= 0; i--)
		{
			if (ans[i] > 0)
			{
				break;
			}
		}
		if (i < 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(ans[j]);
		}
		System.out.print("\n");
		return 0;
	}
}
