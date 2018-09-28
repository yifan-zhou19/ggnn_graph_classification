import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char cha;
		String a = new String(new char[500]);
		String pointa = null;
		pointa = a; //????????
		int len;
		int i;
		a = new Scanner(System.in).nextLine(); //?????
		len = a.length(); //????
		for (i = 0;i < len - 1;i++)
		{ //??
			cha = (char)((int) * (pointa.Substring(i)) + (int) * (pointa.Substring(i) + 1)); //??????
			System.out.print(cha);
		}
		cha = (char)((int) * (pointa.Substring(len) - 1) + (int) pointa); //????????
		System.out.print(cha);
		System.out.print("\n");
		return 0; //????????0
	}

}
