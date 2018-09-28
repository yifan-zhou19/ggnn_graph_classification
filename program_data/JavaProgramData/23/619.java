import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s1 = new String(new char[101]);
	 String s2 = new String(new char[101]);
	 int k1;
	 int k2;
	 int l1;
	 int l2 = 0;
	 s1 = new Scanner(System.in).nextLine();
	 l1 = s1.length();
	 k1 = l1 - 1;
	 k2 = l1 - 1;
	 for (int i = l1 - 1;i >= 0;i--)
	 {
	   if (s1.charAt(i) == ' ' || i == 0)
	   {
	   k1 = i;
	   if (i == 0)
	   {
		if (k2 == l1 - 1)
		{
			k1 -= 1;
		}
		else
		{
			k1 -= 1;
			k2 -= 1;
		}
	   }
	   for (int j = k1 + 1;j <= k2;j++)
	   {
		s2 = tangible.StringFunctions.changeCharacter(s2, j - k1 - 1 + l2, s1.charAt(j));
	   }
	   l2 += k2 - k1;
	   if (k2 == l1 - 1 && k1 != -1)
	   {
		   s2 = tangible.StringFunctions.changeCharacter(s2, l2, ' ');
		   l2++;
	   }
	   k2 = k1;
	   }
	 }
	 s2 = tangible.StringFunctions.changeCharacter(s2, l2, '\0');
	 System.out.print(s2);
	 return 0;
	}
}

