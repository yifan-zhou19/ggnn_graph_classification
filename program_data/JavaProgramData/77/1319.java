import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char b;
		char c;
		a = new Scanner(System.in).nextLine(); //?????
		b = a.charAt(0); //????????b?????
		int i;
		int j;
		int l;
		l = a.length();
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
			c = a.charAt(i);
			break;
			} //?????a[0]?????c?????
		}
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == c) //??a[i]???
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0'); //?a[i]??0
				for (j = i;j >= 0;j--)
				{
					if (a.charAt(j) == b) //?i??????????
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, j, '0'); //?a[j]??0
						break; //??????
					}
				}
			}
		}
		return 0;
	}
}

