package <missing>;

public class GlobalMembers
{
	///#include<math.h>

	public static int Main()
	{
	 int i;
	 int len;
	 int max;
	 int maxi;
	 String substr = new String(new char[4]);
	 String str = new String(new char[11]);
	 for (i = 0;i < 4;i++)
	 {
		 substr = tangible.StringFunctions.changeCharacter(substr, i, -1);
	 }
	 for (i = 0;i < 11;i++)
	 {
		 str = tangible.StringFunctions.changeCharacter(str, i, -1);
	 }
	 while (scanf("%s%s",str,substr) != EOF)
	 {
		 len = str.length();
		 max = -1;
		 maxi = -1;
		 for (i = 0;i < len;i++)
		 {
			 if (str.charAt(i) > max)
			 {
				 max = str.charAt(i);
				 maxi = i;
			 }
		 }
		 for (i = 0;i < len;i++)
		 {
			 System.out.printf("%c",str.charAt(i));
			 if (i == maxi)
			 {
				 System.out.printf("%s",substr);
			 }
		 }
		 System.out.print("\n");
	 }
	 return 0;
	}

}

