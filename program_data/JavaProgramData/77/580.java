import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void leave(String a, char b)
	{
		int i;
		int temp;
		if (a[0].equals(b))
		{
			for (i = 0; !a[i].equals('\0');)
			{
				if (a[i].equals(b))
				{
					temp = i;
					i++;
					while (a[i].equals(0))
					{
						i++;
					}
					if (!a[i].equals(b) && !a[i].equals(0))
					{
						a[i] = null;
						a[temp] = null;
						System.out.print(temp);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
					}
				}
			}
			leave(a, b);
		}
	}

	public static int Main()
	{
		String a = new String(new char[100]);
		char b;
		a = new Scanner(System.in).nextLine();
		b = a.charAt(0);
		leave(a, b);
		return 0;
	}
}
