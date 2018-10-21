import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a0 = new int[251];
		int[] b0 = new int[251];
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a0, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b0, 0, (Integer.SIZE / Byte.SIZE));
		for (int i = 0; i <= a.length() - 1; i++)
		{
			a0[i] = a.charAt(a.length() - 1 - i) - '0';
		}
		for (int i = 0; i <= b.length() - 1; i++)
		{
			b0[i] = b.charAt(b.length() - 1 - i) - '0';
		}
		for (int i = 0; i <= 249; i++)
		{
			a0[i + 1] += (a0[i] + b0[i]) / 10;
			a0[i] = (a0[i] + b0[i]) % 10;
		}
		int j = 0;
		for (int i = 249; i >= 0; i--)
		{
			if (a0[i] != 0)
			{
				j = i;
				break;
			}
		}
		for (int i = j; i >= 0; i--)
		{
			System.out.print(a0[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
