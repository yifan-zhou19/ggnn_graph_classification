import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[100];

	//???????????????????????? ?????k??
	public static void sort(String str, int[] f, int l, int k, char m)
	{
		if (k == l)
		{
			return; //????????????
		}
		int i;
		if (!str[k].equals(m) && f[k] == 1)
		{
			//???????????
			for (i = k - 1; i >= 0; i--) //????????????????
			{
				if (str[i].equals(m) && f[i] == 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(k);
					System.out.print("\n");
					f[i] = 0;
					f[k] = 0;
					break;
				}
			}
		}
		sort(str, f, l, k + 1, m); //??????
	}
	public static int Main()
	{

		String str = new String(new char[101]);
		char m;


		int l;
		int i = 0;
		int k;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		m = str.charAt(0);
		for (i = 0; i < l; i++)
		{
			f[i] = 1;
		}
		i = 0;
		while (str.charAt(i) == m)
		{
			i++;
		}
		k = i; // ???????
		sort(str, f, l, k, m); //?????????
		return 0;
	}

}
