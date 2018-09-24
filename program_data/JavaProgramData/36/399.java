package <missing>;

public class GlobalMembers
{
	public static int comp(String s1, String s2, int j, int i)
	{
		if (s1[j].equals(s2[i]))
		{
			s2[i] = null;
			return (1);
		}
		else if ((!s1[j].equals(s2[i])) && (i > 0))
		{
				i = i - 1;
				return (comp(s1, s2, j, i));
		}
		else if ((!s1[j].equals(s2[i])) && (i == 0))
		{
		return (0);
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int k;
		int y;
		int u;
	 String str1 = new String(new char[100]);
	 String str2 = new String(new char[100]);
	 char c;
	 for (i = 0;(c = System.in.read()) != ' ';i++)
	 {
		 str1 = tangible.StringFunctions.changeCharacter(str1, i, c);
	 }
	 str2 = new Scanner(System.in).nextLine();
	 i = i - 1;
	 j = str2.length() - 1;
	 if (i != j)
	 {
	 System.out.print("NO");
	 }
	 else
	 {
		 u = i;
		 for (k = 0,y = 0;k <= u;k++)
		 {
			 if (comp(str1, str2, k, i) == 0)
			 {
				 y = 1;
				 break;
			 }
		 }
		 if (y == 0)
		 {
			 System.out.print("YES");
		 }
		 else if (y == 1)
		 {
			 System.out.print("NO\n");
		 }
	 }
	}

}

