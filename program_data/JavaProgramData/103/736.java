import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		String route = new String(new char[1001]);
		route = new Scanner(System.in).nextLine();
		int len = route.length();
		for (i = 0; i < len; i++)
		{
			int count = 1;
			if (i == len - 1)
			{
				if ((route.charAt(i) >= 97) && (route.charAt(i) <= 122))
				{
					route = tangible.StringFunctions.changeCharacter(route, i, route.charAt(i) - 32);
				}
				System.out.print('(');
				System.out.print(route.charAt(i));
				System.out.print(',');
				System.out.print(count);
				System.out.print(')');
				break;
			}
			// i <= len - 2,?i???????
			for (k = i + 1; k < len; k++)
			{
				if ((route.charAt(k) == route.charAt(i)) || (route.charAt(k) == route.charAt(i) + 32) || (route.charAt(i) == route.charAt(k) - 32))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			// ???????????break??route[k] ?route[i]???????????k == len;
			if ((route.charAt(i) >= 97) && (route.charAt(i) <= 122))
			{
				route = tangible.StringFunctions.changeCharacter(route, i, route.charAt(i) - 32);
			}
			System.out.print('(');
			System.out.print(route.charAt(i));
			System.out.print(',');
			System.out.print(count);
			System.out.print(')');
			if (k != len - 1) // ????k??????
			{
				i = k - 1;
			}
		}
		return 0;
	}

}

