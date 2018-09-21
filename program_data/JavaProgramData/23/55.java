package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[100]);
		String string2 = new String(new char[100]);
		char[][] str = new char[100][100];
		int i = 0;
		int j = 0;
		int k = 0;
		char c;
		string1 = new Scanner(System.in).nextLine();
		for (i = 0;(c = string1.charAt(i)) != '\0';i++)
		{
			   if (c != ' ')
			   {
				str[j][k] = string1.charAt(i);
				k++;
			   }
			 else if (c == ' ')
			 {
				j++;
				k = 0;
			 }

		}
		string2 = "";
		for (i = j;i > 0;i--)
		{
			string2 += str[i];
			string2 += " ";
		}
		string2 += str[0];
		System.out.printf("%s",string2);
	}

}
