import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void match(String child, int l)
	{
		for (int i = 0 ; i <= l ; i++)
		{
			if (child[i].equals(child[0])) //if he is a boy
			{
				for (int j = i + 1 ; j <= l ; j++)
				{
					if (child[j].equals(child[0])) //if the next one is a boy
					{
						break;
					}
					else if (!child[j].equals(child[0]) && !child[j].equals('\0')) //if the next one is a girl
					{
						child[i] = child[j] = '\0'; //let them go
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						match(child, l); //once again
					}
				}
			}
		}
		return;
	}
	public static int Main()
	{
		String child = new String(new char[101]);
		child = new Scanner(System.in).nextLine();
		match(child, child.length());

		return 0;
	}
}
