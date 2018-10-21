import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //??????ij???k?????n
		int j;
		int k;
		int n;
		String a = new String(new char[81]); //????a
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			k = 1;
			a = new Scanner(System.in).nextLine(); //??
			if ((a.charAt(0) > 47) && (a.charAt(0) < 58))
			{
				k = 0;
			}
			for (j = 0;j < a.length();j++)
			{
				if (((a.charAt(j) > 64) && (a.charAt(j) < 91)) || ((a.charAt(j)>96) && (a.charAt(j) < 123)) || a.charAt(j) == '_' || ((a.charAt(j)>47) && (a.charAt(j) < 58)))
				{
					continue;
				}
				k = 0; //???????????
			}
			System.out.print(k);
			System.out.print("\n");
		}
		return 0;
	}

}

