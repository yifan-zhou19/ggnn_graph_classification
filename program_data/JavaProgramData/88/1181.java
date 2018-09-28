import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**************************
	//*????????        *
	//*?????              *
	//*?????2010?12?    *
	//**************************
	public static int Main()
	{
		String a = new String(new char[31]);
		int n;
		int j;
		a = new Scanner(System.in).nextLine(); //?????
		n = a.length();
		for (int i = 0;i < n;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				for (j = i;a.charAt(j) >= '0' && a.charAt(j) <= '9';j++)
				{
					System.out.print(a.charAt(j));
				}
				i = j;
				System.out.print("\n");
			}
		} //???????
		return 0; //??
	}
}
