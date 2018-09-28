package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[200]);
	 int n;
	 int i;
	 int j;
	 int k;
	 str = new Scanner(System.in).nextLine();
	 for (i = 0;str.charAt(i) != '\0';i++)
	 {
		 if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
		 {
			 k = i + 1;
			 while (str.charAt(k) == ' ')
			 {
				k++;
			 }
			 for (j = i + 1;str.charAt(j) != '\0';j++)
			 {
				 str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + k - i - 1));
			 }
		 }
	 }
	 System.out.printf("%s",str);
	return 0;
	}
}

