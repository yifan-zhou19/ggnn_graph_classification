import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 String str1 = new String(new char[100]); //?????????
			 String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine(); //?str1??
		int k = 0;
			 int flag = 0;
		for (int i = 0;str1.charAt(i) != '\0';i++) //for ??
		{
			if ((str1.charAt(i) == ' ') && (flag == 0)) //?????????0
			{
					flag = 1; //????1
					str2 = tangible.StringFunctions.changeCharacter(str2, k, str1.charAt(i)); //????str2?
					k++;
			}
			 if (str1.charAt(i) != ' ') //??????
			 {
				   flag = 0; //???0
				   str2 = tangible.StringFunctions.changeCharacter(str2, k, str1.charAt(i)); //??str2?
				   k++;
			 }

		}
		for (int j = 0;j < k;j++) //??str2
		{
			System.out.print(str2.charAt(j));
		}
		return 0;
	}




}

