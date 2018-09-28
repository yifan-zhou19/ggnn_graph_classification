import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void maxhui(String huichuan, String chuan, int i)
	{
		int k;
		int l = 1;
		for (k = i ; ; k++)
		{
			if (chuan[k].equals(chuan[k - 2 * l + 1]))
			{
				huichuan[l - 1] = chuan[k];
				l = l + 1;
			}
			else
			{
				break;
			}
		}
		huichuan[l - 1] = '\0';
	}



	public static int Main()
	{
		String chuan = new String(new char[500]);
		char[][] huichuan = new char[500][500];
		int i;
		int j;
		int k = 0;
		int length;
		int p;
		chuan = new Scanner(System.in).nextLine();
		for (i = 1 ; i < chuan.length() ; i++)
		{
			if (chuan.charAt(i) == chuan.charAt(i - 1))
			{
				maxhui(huichuan[k], chuan, i);
				k++;
			}
		}
		int[] maxlen = new int[500];
		int maxlength = 0;
		for (i = 0 ; i < k ; i++)
		{
			if (String.valueOf(huichuan[i]).length() > maxlength)
			{
				maxlength = String.valueOf(huichuan[i]).length();
			}
		}
		for (i = 0 ; i < maxlength ; i++)
		{
			for (j = 0 ; j < k ; j++)
			{
				if (String.valueOf(huichuan[j]).length() > i)
				{
					for (p = i ; p >= 0 ; p--)
					{
						System.out.print(huichuan[j][p]);
					}
					for (p = 0 ; p <= i ; p++)
					{
						System.out.print(huichuan[j][p]);
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}





}
