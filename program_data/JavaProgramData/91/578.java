import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*-----------------------------------------*
	|? ? ?   ????????           	    |
	|? ?      ????	                    |
	|? ? ? ??2010 ? 12 ? 15 ?		    |
	|? ?      ?1000012758		            |
	\*-----------------------------------------*/
	public static int Main()
	{
		int Len;
		String Text = new String(new char[1000]);
		char temp;
		Text = new Scanner(System.in).nextLine();
		Len = Text.length();
		temp = Text.charAt(0); //?????
		for (int i = 0; i < Len - 1; i++)
		{
			Text.charAt(i) += Text.charAt(i + 1); //???????????
		}
		Text.charAt(Len - 1) += temp; //???????????
		System.out.print(Text);
		System.out.print("\n");
		return 0;
	}
}
