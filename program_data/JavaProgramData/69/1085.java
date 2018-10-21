import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int[] a1 = new int[251];
		int[] b2 = new int[251];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b2,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0; i <= a.length() - 1; i++)
		{
			a1[i] = a.charAt(a.length() - i - 1) - '0';
		}

		for (int i = 0; i <= b.length() - 1; i++)
		{
			b2[i] = b.charAt(b.length() - 1 - i) - '0';
		}

		for (int i = 0;i < 250;i++)
		{
			b2[i + 1] += (a1[i] + b2[i]) / 10;
			b2[i] = (a1[i] + b2[i]) % 10;
		}

		int k;
		for (k = 249;k >= 0;k--)
		{
			if (b2[k] != 0)
			{
				break;
			}
		}
		for (int j = k;j >= 0;j--)
		{
			System.out.print(b2[j]);
		}
		if (k == -1)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}
}
