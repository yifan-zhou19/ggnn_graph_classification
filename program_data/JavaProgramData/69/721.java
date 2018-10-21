import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[250]); //???????????????
	public static String b = new String(new char[250]);
	public static int[] A = new int[250]; //????????????????????????[249]?
	public static int[] B = new int[250];
	public static int[] C = new int[251];
	public static int carrybit = 0; //?carrybit?????
	public static int m = -1; //?m???C?????????????
	public static void add(int n)
	{
		if (n < 0)
		{
			C[n + 1] = carrybit;
			return;
		}
		C[n + 1] = (A[n] + B[n] + carrybit) % 10;
		carrybit = (A[n] + B[n] + carrybit) / 10;
		add(n - 1);
	}
	public static int Main()
	{
		int i = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int al = a.length();
		int bl = b.length();
		for (i = 0;i < al;i++)
		{
			A[250 - al + i] = (int)a.charAt(i) - 48;
		}
		for (i = 0;i < 250 - al;i++)
		{
			A[i] = 0; //????a????????A??
		}
		for (i = 0;i < bl;i++)
		{
			B[250 - bl + i] = (int)b.charAt(i) - 48;
		}
		for (i = 0;i < 250 - bl;i++)
		{
			B[i] = 0; //????b????????B??
		}
		add(249);
		for (i = 0;i < 251;i++)
		{
			if (C[i] != 0)
			{
			m = i;
			break;
			}
		}
		if (m == -1)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (m >= 0)
		{
			for (i = m;i < 251;i++)
			{
				System.out.print(C[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}
