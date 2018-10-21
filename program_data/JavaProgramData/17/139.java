import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[105]);
		String sign = new String(new char[105]);
		int num = 0;
		int i;
		int len;
		while (word = new Scanner(System.in).nextLine())
		{
			   num = 0;
		   len = word.length();
		for (i = 0;i < len;i++)
		{
		sign = tangible.StringFunctions.changeCharacter(sign, i, ' ');
		}
		for (i = 0;i < len;i++)
		{
			   if (word.charAt(i) == '(')
			   {
				  num++;
			   }
			   if (word.charAt(i) == ')')
			   {
					  if (num > 0)
					  {
					  num--;
					  }
					  else
					  {
						  sign = tangible.StringFunctions.changeCharacter(sign, i, '?');
					  }
			   }
		}
		num = 0;
		for (i = len - 1;i >= 0;i--)
		{
			   if (word.charAt(i) == ')')
			   {
				  num++;
			   }
			   if (word.charAt(i) == '(')
			   {
					  if (num > 0)
					  {
					  num--;
					  }
					  else
					  {
						  sign = tangible.StringFunctions.changeCharacter(sign, i, '$');
					  }
			   }
		}
		sign = tangible.StringFunctions.changeCharacter(sign, len, '\0');
		System.out.print(word);
		System.out.print("\n");
		System.out.print(sign);
		System.out.print("\n");
		}
		return 0;
	}

}

