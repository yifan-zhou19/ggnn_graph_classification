import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????.cpp                     **
	//*??: ??     1100012808              **
	//*???2011.11.13                       **
	//******************************************
	public static void zch(String a)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int flag = 0;
		int l;
		for (i = 2; i < a.length(); i++)
		{
			for (j = 0; j <= a.length() - i; j++)
			{
				for (k = j; k < i / 2 + j; k++)
				{
					if (!a[k].equals(a[i + j - 1 - (k - j)]))
					{
						break;
					}
				}
				if (k == i / 2 + j)
				{
					for (l = j; l < i + j; l++)
					{
						System.out.print(a[l]);
					}
					System.out.print("\n");
					System.out.print("\n");
				}
			}
		}
		return;
	}
	public static int Main() //???
	{ //?????
		String ch = new String(new char[100000]);
		int i = 0;
		ch = new Scanner(System.in).nextLine();
		zch(ch);
		return 0;
	}




}
