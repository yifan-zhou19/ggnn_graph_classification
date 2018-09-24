import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] A = new int[251];
		int[] B = new int[251];
		int[] c = new int[251];
		int i;
		int p;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = a.length() - 1;i >= 0;--i)
		{
			A[a.length() - 1 - i] = a.charAt(i) - '0';
		}
		for (i = b.length() - 1;i >= 0;--i)
		{
			B[b.length() - 1 - i] = b.charAt(i) - '0';
		}
		for (i = 0;i < 251;++i)
		{
			p = A[i] + B[i];
			if (p + c[i] > 9)
			{
				c[i] = (p + c[i]) % 10;
				c[i + 1]++;
			}
			else
			{
				c[i] += p;
			}
		}
		for (i = 250;i >= 0;i--)
		{
			if (c[i] != 0)
			{
				break;
			}
		}
		if (i != -1)
		{
		for (p = i;p >= 0;p--)
		{
			System.out.print(c[p]);
		}
		}
		else
		{
			System.out.print(0);
		}
	}

}
