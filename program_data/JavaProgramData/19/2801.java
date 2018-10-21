import java.util.*;

package <missing>;

public class GlobalMembers
{
	/************************/
	/*       ????       */
	/*    ??? pyyaoer    */
	/*   ??  2011.11.18   */
	/************************/
	public static int Main()
	{
		int la;
		int lb;
		int i;
		int j;
		int count = 1;
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		la = a.length();
		b = new Scanner(System.in).nextLine();
		lb = b.length();
		c = new Scanner(System.in).nextLine();
		do
		{
			for (i = count - 1;i <= la - 1;i++)
			{
				if (a.charAt(i) != b.charAt(0) || i >= 1 && a.charAt(i - 1) != ' ') //??????????????????????
				{
					System.out.print(a.charAt(i));
					count++;
				}
				else
				{
					break;
				}
			}
			if (a.charAt(i) == b.charAt(0) && (i >= 1 && a.charAt(i - 1) == ' ' || i == 0)) //???????????????
			{
				for (j = 0;j <= lb - 1;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						break;
					}
				}
				count = count + j + 1;
				if (j == lb && ((i + j) < la && a.charAt(i + j) == ' ')) //????????
				{
					System.out.print(c);
					System.out.print(" ");
				}
				else if (i + j == la)
				{
					System.out.print(c);
				}
				else
				{
					for (j = i;j <= count - 2;j++) //???????
					{
						System.out.print(a.charAt(j));
					}
				}
			}
		} while (count < la); //??????????????
		System.out.print("\n");
		return 0;
	}
}
