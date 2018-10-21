import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int[] b = new int[100]; //????
		int count = 0; //????
		int i; //??
		int j;
		int l = a.length(); //??
		for (i = 0;i < l;i++)
		{
						if (a.charAt(i) == ' ')
						{
								   count++;
								   b[count] = i;
						} //??????
		}
		count++;
		b[count] = l; //?????????????
		for (i = count;i >= 2;i--)
		{
							 for (j = b[i - 1] + 1;j < b[i];j++)
							 {
													   System.out.print(a.charAt(j));
							 }
							 System.out.print(" ");
		}
		for (j = 0;j < b[1];j++)
		{
						   System.out.print(a.charAt(j));
		} //??
		return 0;
	}

}
