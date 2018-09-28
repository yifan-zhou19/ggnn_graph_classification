import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************************************************************
	//?????????????????                                        *
	//????wayne                                                             *
	//?????12.22                                                           *
	//***************************************************************************
	public static int Main()
	{
		String sentence = new String(new char[100]); //?????????
		int i; //??????
		int len;
		sentence = new Scanner(System.in).nextLine(); //??????
		len = sentence.length(); //??????
		for (i = 0;i <= len - 2;i++) //????
		{
			if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ' ') //?????
			{
				continue; //???
			}
			else
			{
				System.out.print(sentence.charAt(i));
			}
		}
		System.out.print(sentence.charAt(len - 1));
		System.out.print("\n");
		return 0;
	}
}
