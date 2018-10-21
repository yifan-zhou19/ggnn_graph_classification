package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*11.15??  ????                                  *
	//*?????  ?? 1100012844                          *
	//*???2011?11?23?                                 *
	//*******************************************************
	public static String a = new String(new char[100]);
	public static char boy;
	public static char girl;
	public static int[] girlNO = new int[50];
	public static int[] flag = new int[100];
	public static void qianshou(int k)
	{
		int i;
		if (k != 0)
		{
			qianshou(k - 1);
		}
		i = girlNO[k] - 1;
		while (a.charAt(i) == girl || flag[i] != 0)
		{
			i--;
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(girlNO[k]);
		System.out.print("\n");
		flag[i] = 1;
	}
	public static int Main()
	{
		int j = 1;
		int n = 0;
		a = tangible.StringFunctions.changeCharacter(a, 0, System.in.read());
		boy = a.charAt(0);
		while ((a[j] = System.in.read()) != '\n')
		{
			if (a.charAt(j) != boy)
			{
				girlNO[n] = j;
				n++;
			}
			j++;
		}
		girl = a.charAt(j - 1);
		qianshou(n - 1);
		return 0;
	}
}

