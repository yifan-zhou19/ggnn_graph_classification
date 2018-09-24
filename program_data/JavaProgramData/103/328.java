import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char temp;
		int i;
		int n;
		int alen;
		int count = 0;
		a = new Scanner(System.in).nextLine();
		alen = a.length();
		for (i = 0 ; i < alen ; i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				a.charAt(i) -= 32;
			}
		}
		temp = a.charAt(0);
		for (i = 0 ; i < alen ; i++)
		{
			do
			{
				if (a.charAt(i) == temp)
				{
					count++;
				}
				if (a.charAt(i) != temp)
				{
					System.out.print("(");
					System.out.print(temp);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
					temp = a.charAt(i);
					count = 1;
				}
				i++;
			}while (a.charAt(i) != '\0');
			System.out.print("(");
			System.out.print(temp);
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
		}
		return 0;

	}

}
