import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		int[] t = new int[100];
		int[] u = new int[100];
		int flag = 1;
		int tmp;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(u,0,(Integer.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		for (int i = 0; i < a.length(); i++)
		{
			t[i] = a.charAt(i) - '0';
		}
		if (a.length() == 1)
		{
			System.out.print(t[0] / 13);
			System.out.print("\n");
			System.out.print(t[0] % 13);
			System.out.print("\n");
		}
		else if (a.length() == 2)
		{
			System.out.print((10 * t[0] + t[1]) / 13);
			System.out.print("\n");
			System.out.print((10 * t[0] + t[1]) % 13);
			System.out.print("\n");
		}
		else
		{
			tmp = 10 * t[0] + t[1];
			u[0] = tmp / 13;
			for (int i = 2;i < a.length();i++)
			{
				tmp %= 13;
				tmp = t[i] + tmp * 10;
				u[flag] = tmp / 13;
				flag++;
			}
			tmp %= 13;
			for (j = 0; j < flag; j++)
			{
				if (u[j] != 0)
				{
					break;
				}
			}
			for (;j < flag;j++)
			{
				System.out.print(u[j]);
			}
			System.out.print("\n");
			System.out.print(tmp);
			System.out.print("\n");
		}
		return 0;
	}
}
