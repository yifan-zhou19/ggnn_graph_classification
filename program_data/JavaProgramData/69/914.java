import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str_1 = new int[250];
		int[] str_2 = new int[250];
		String str_a = new String(new char[251]);
		String str_b = new String(new char[251]);
		int len_a;
		int len_b;
		str_a = new Scanner(System.in).nextLine();
		str_b = new Scanner(System.in).nextLine();
		len_a = str_a.length();
		len_b = str_b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str_1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str_2,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		for (i = len_a - 1;i >= 0;i--)
		{
			str_1[j++] = str_a.charAt(i) - '0';
		}
		j = 0;
		for (i = len_b - 1;i >= 0;i--)
		{
			str_2[j++] = str_b.charAt(i) - '0';
		}
		for (i = 0;i < 250;i++)
		{
			str_1[i] += str_2[i];
			if (str_1[i] >= 10)
			{
				str_1[i + 1]++;
				str_1[i] -= 10;
			}
		}
		for (i = 249;i >= 0;i--)
		{
			if (str_1[i] != 0)
			{
				break;
			}
		}
		if (i == -1)
		{
			System.out.print(0);
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(str_1[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}
