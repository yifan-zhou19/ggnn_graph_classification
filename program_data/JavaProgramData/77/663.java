import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char boy;
	public static char girl;
	public static int l;
	public static void result(String a, int remain) //????????????????????????????
	{
		int i;
		int j;
		for (i = 0;i < l;i++)
		{
			if (a[i].equals(girl))
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a[j].equals(boy))
					{
					break;
					}
				}
				a[i] = '0';
				a[j] = '0';
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				remain = remain - 2;
				break;
			}
		}
		if (remain > 0)
		{
			result(a, remain); //?????????????????????????
		}
	}


	public static int Main()
	{
		int i;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		boy = a.charAt(0);
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i) != boy) //??????????
			{
				girl = a.charAt(i);
			break;
			}
		}
		result(a, l);
		return 0;
	}



}
