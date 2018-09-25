import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void handinhand(char xpy[],int num,int left,char boy,char girl);
		final String xpy = "";
		char boy;
		char girl;
		int num;
		xpy = new Scanner(System.in).nextLine(); //?????
		boy = xpy.charAt(0); //????
		for (num = 0;xpy.charAt(num) != 0;num++)
		{
			;
		}
		girl = xpy.charAt(num - 1); //????
		handinhand(xpy, num, num, boy, girl); //????????
		return 0;
	}
	public static void handinhand(String xpy, int num, int left, char boy, char girl)
	{
		int i = 0;
		int j;
		int lf = left;
		if (left > 0) //??????0
		{
			for (i = 0; !xpy[i].equals(girl);i++)
			{
				; //???????,?????????
			}
			for (j = i - 1; !xpy[j].equals(boy) && j > -1;j--)
			{
				; //????????????????????
			}
			System.out.print(j);
			System.out.print(' ');
			System.out.print(i);
			System.out.print("\n");
			lf = left - 2; //??????
			xpy[i] = null; //??2???
			xpy[j] = null;
			handinhand(xpy, num, lf, boy, girl); //?????????
		}
	}
}
