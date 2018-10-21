import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //??????i
		 String str1 = new String(new char[80]); //?????str1[i]?str2[i]
		 String str2 = new String(new char[80]);
		 str1 = new Scanner(System.in).nextLine();
		 str2 = new Scanner(System.in).nextLine();
		 for (i = 0;i <= 80;i++)
		 {
			 if (96 < str1.charAt(i) && str1.charAt(i) < 123) //?str1[i]???[97,122]???,???????,????????
			 {
			 str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			 }
			 if (96 < str2.charAt(i) && str2.charAt(i) < 123)
			 {
			 str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
			 }
		 }
		 i = strcmp(str1,str2); //?strcmp????????i
		 if (i == 1)
		 {
			 System.out.print(">");
			 System.out.print("\n");
		 }
		 if (i == 0)
		 {
			 System.out.print("=");
			 System.out.print("\n");
		 }
		 if (i == -1)
		 {
			 System.out.print("<");
			 System.out.print("\n");
		 }
		 return 0;
	}

}

