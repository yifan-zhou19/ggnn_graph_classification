import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] n = new int[251];
		int[] m = new int[251];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(n,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(m,0,(Integer.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int l1 = a.length();
		int l2 = b.length();
		for (int i = 0;i < l1;i++)
		{
			n[i] = a.charAt(l1 - i - 1) - '0'; //?????
		}
		for (int j = 0;j < l2;j++)
		{
			m[j] = b.charAt(l2 - j - 1) - '0'; //?????
		}
		for (int i = 0;i < 250;i++)
		{
			 n[i] += m[i];
			if (n[i] > 9)
			{
					n[i] -= 10;
					n[i + 1]++;
			}
		}
		int k = 250;
		while (n[k] == 0)
		{
			k--;
		}
			if (k < 0)
			{
				System.out.print("0");
			}
			else
			{
				for (;k >= 0;k--)
				{
				System.out.print(n[k]);
				}
			}
		return 0;
	}



}
