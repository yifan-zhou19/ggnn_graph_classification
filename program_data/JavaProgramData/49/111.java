import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	//


	public static void out()
	{
		int i = 0;
		int leng = 0;
		int t = 0;
		int m = 0;
		int k = 0;
		int panduan = 0;

		int len = 0;
		len = num.Substring(1).length();

		for (leng = 2;leng <= len;leng++)
		{
			m = leng / 2;
			for (i = 1;i <= len - leng + 1;i++)
			{
				panduan = 0;
				k = i + leng;
				for (t = i;t < i + m;t++)
				{
					k--;
					if (num.charAt(t) != num.charAt(k))
					{
						panduan = 1;
						break;
					}
				}

				if (panduan == 0)
				{
					for (t = i;t < i + leng;t++)
					{
						System.out.print(num.charAt(t));
					}
					System.out.print("\n");
				}

			}

		}

	}
	public static String num = new String(new char[501]);

	public static int Main()
	{

		num.Substring(1) = new Scanner(System.in).nextLine();

		out();

		return 0;

	}







}
