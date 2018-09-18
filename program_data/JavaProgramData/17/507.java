import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //????????????????????
	{
		final String a = "";
		while (a = new Scanner(System.in).nextLine()) //??n???
		{
		int left = 0;
		int right = 0;
		int tema = 0;
		int[] b = new int[110];
		final String d = "";
		for (int i = 1;a.charAt(i - 1) != '\0';i++)
		{
			System.out.print(a.charAt(i - 1));
		}
		System.out.print("\n");
		for (int i = 1;a.charAt(i - 1) != '\0';i++)
		{
		d = tangible.StringFunctions.changeCharacter(d, i - 1, ' ');
		if (a.charAt(i - 1) == '(') //????????left+1????????
		{
			left++;
		b[tema++] = i - 1;
		}
		else if (a.charAt(i - 1) == ')') //????????????
		{
		if (left <= right) //?????????????????
		{
			d = tangible.StringFunctions.changeCharacter(d, i - 1, '?');
		}
		if (left > right) //??????????
		{
			right++;
			tema--;
		} //?????1?????1
		}
		}
		for (int k = 1;k <= tema;k++) //??????????
		{
		d = tangible.StringFunctions.changeCharacter(d, b[k - 1], '$');
		}
		for (int i = 1;a.charAt(i - 1) != '\0';i++) //????
		{
		System.out.print(d.charAt(i - 1));
		}
		System.out.print("\n");
		for (int i = 1;i <= 100;i++)
		{
			a.charAt(i - 1) == '\0';
		}
		} //?????
		return 0;
	}



}

