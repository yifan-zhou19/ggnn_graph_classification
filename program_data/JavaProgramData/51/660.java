import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************
	//**???3.cpp
	//**??????
	//**???2013.12.11
	//**?????n-gram????
	//***************************

	public static void exp(int a)
	{
		if (a == len - n + 1) // ????
		{
			return;
		}

		int flag; // flag???????

		for (int i = a; i <= len - n; i++) // ?????????
		{
			flag = 0;
			for (int j = 0; j <= n - 1; j++)
			{
				if (*(str.Substring(i) + j) == *(str.Substring(a) + j))
				{
					flag++;
				}
				else
				{
					break;
				}
			}
			if (flag == n) // n?????????????1
			{
				(sumstr[a])++;
			}
		}
		maximum = sumstr[a] > maximum != 0? sumstr[a]: maximum; // ?????
		exp(a + 1); // ????????????
	}
	public static void pick()
	{
		System.out.print(maximum);
		System.out.print("\n");
		for (int i = 0; i <= len - n; i++)
		{
			if (sumstr[i] == maximum) // ?????????????
			{
				for (int j = 0; j <= n - 1; j++)
				{
					System.out.print((str.Substring(i) + j));
				}
				System.out.print("\n");
			}
		}
	}
	public static int n;
	public static String str = new String(new char[501]);
	public static int[] sumstr = new int[499]; // ????????
	public static int len;
	public static int maximum = INT_MIN;

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); // ????
		str = new Scanner(System.in).nextLine();
		len = str.length();
		exp(0); // ??????????
		if (maximum <= 1) // ???????????NO
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			pick(); // ??????????????
		}
		return 0;
	}
}

