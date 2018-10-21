package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] str = new char[20][10];
	 char[][] string = new char[20][4];
	 char d;
	 int i;
	 int j;
	 int[] m = new int[20];
	 int[] l = new int[20];
	 for (i = 0;;i++)
	 {
		 d = '\0';
	 if (scanf("%s %s", str[i], string[i]) == EOF)
	 {
		 break;
	 }

		 for (j = 0;str[i][j] != '\0';j++)
		 {
			 if ((int)str[i][j] > m[i])
			 {
				 m[i] = str[i][j];
			 }
		 }





		 for (j = 0;str[i][j] != '\0';j++)
		 {
			 if (m[i] == str[i][j])
			 {
			 l[i] = j;
			 break;
			 }
		 }
		 for (j = 0;j <= l[i];j++)
		 {
			 System.out.printf("%c",str[i][j]);
		 }
		 for (j = 0;j < String.valueOf(String[i]).length();j++)
		 {
			 System.out.printf("%c",string[i][j]);
		 }
		 for (j = l[i] + 1;str[i][j] != '\0';j++)
		 {
			 System.out.printf("%c",str[i][j]);
		 }
		 System.out.print("\n");
	 }
	}
}
