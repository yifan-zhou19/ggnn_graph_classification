import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int l1;
		int l2;
		String s = new String(new char[200]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l = s.length();
		l1 = a.length();
		l2 = b.length();
		for (i = l;i >= 0;i--)
		{
			s = tangible.StringFunctions.changeCharacter(s, i + 1, s.charAt(i));
		}
		s = tangible.StringFunctions.changeCharacter(s, 0, ' ');
		l += 1;
		for (i = 0;i <= l + 1;i++)
		{
			if (s.charAt(i) == ' ')
			{
				for (j = i + 1;j <= i + l1;j++)
				{
					if (s.charAt(j) != a.charAt(j - i - 1))
					{
						break;
					}
					else
					{
					   if (j == i + l1 && (s.charAt(i + l1 + 1) == ' ' || s.charAt(i + l1 + 1) == '\0'))
					   {
						   if (l2 >= l1)
						   {
							   l += l2 - l1;
							   for (k = l - l2 + l1;k >= i + l1 + 1;k--)
							   {
								   s = tangible.StringFunctions.changeCharacter(s, k + l2 - l1, s.charAt(k));
							   }
							   for (k = i;k <= i + l2 - 1;k++)
							   {
								   s = tangible.StringFunctions.changeCharacter(s, k + 1, b.charAt(k - i));
							   }
						   }
						   if (l2 < l1)
						   {
							   for (k = i + l1 + 1;k <= l + 2;k++)
							   {
								   s = tangible.StringFunctions.changeCharacter(s, k + l2 - l1, s.charAt(k));
							   }
							   for (k = i;k <= i + l2 - 1;k++)
							   {
								   s = tangible.StringFunctions.changeCharacter(s, k + 1, b.charAt(k - i));
							   }
						   }
					   }
					}
				}
			}
		}
		for (i = 1;i <= l;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i - 1, s.charAt(i));
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}









}

