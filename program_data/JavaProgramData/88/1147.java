import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[50]);
	   int n;
	   int i;
	   str = new Scanner(System.in).nextLine(); //?????
	   for (n = 0;str.charAt(n) != '\0';n++)
	   {
		   ; //???????
	   }
	   for (i = 0;i < n;i++)
	   {
		if (str.charAt(i) >= 48 && str.charAt(i) <= 57) //???????????
		{
		System.out.print(str.charAt(i));
		}
		else if ((str.charAt(i) < 48 || str.charAt(i)>57) && (str.charAt(i + 1) >= 48 && str.charAt(i + 1) <= 57)) //??????????????????????
		{
		System.out.print("\n");
		}
	   }


	return 0;
	}
}
