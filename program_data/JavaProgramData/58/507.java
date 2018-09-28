import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //???????
		for (int i = 0; i < n; i++)
		{
			String a = new String(new char[81]); //????????
			a = new Scanner(System.in).nextLine();
			int j;
			int l = a.length();
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_')
			{
					for (j = 1; j < l; j++) //???????????????
					{
						if ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) == '_'))
						{
							continue;
						}
						else
						{
							break;
						}
					}
					if (j == l) //???????????????1
					{
						System.out.print("1");
						System.out.print("\n");
					}
					else
					{
						System.out.print("0");
						System.out.print("\n");
					}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
	return 0; //???????????
	} //????

}

