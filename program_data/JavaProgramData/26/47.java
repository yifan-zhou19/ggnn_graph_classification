import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[100]); //sentence???????word????????
		char[][] word = new char[100][100];
		int i = 0; //????
		int j = 0;
		int k = 0;

		sentence = new Scanner(System.in).nextLine(); //??


		for (i = 0;i < sentence.length();i++) //????????????
		{
		   if (sentence.charAt(i) == ' ')
		   {
			   continue; //????
		   }
		   if (sentence.charAt(i) != ' ' && sentence.charAt(i - 1) == ' ') //??????????????
		   {
				 j++;
				 k = 0;
		   } //??????word??
		   word[j][k] = sentence.charAt(i);
		   k++;
		}


		System.out.print(word[0]);
		for (i = 1;i <= j;i++) //??
		{
		System.out.print(" ");
		System.out.print(word[i]);
		}

			return 0;
	}

}
