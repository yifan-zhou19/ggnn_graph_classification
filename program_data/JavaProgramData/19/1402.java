package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] t = new char[100][100];
		int k = 0;
		int y = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (int i = 0;s.charAt(i) != '\0';i++)
		{
			 if (s.charAt(i) == ' ')
			 {
				 t[k][i] = '\0';
				 k++;
				 y = i + 1;
			 }
			  else
			  {
				t[k][i - y] = s.charAt(i);
			  }
		}
		 for (int j = 0;j <= k;j++)
		 {
			  if (strcmp(t[j],a) == 0)
			  {
					t[j] = b;
			  }
		 }
		 for (int x = 0;x < k;x++)
		 {
			 System.out.printf("%s ",t[x]);
		 }
		 System.out.printf("%s",t[k]);
		 return 0;
	}


}
