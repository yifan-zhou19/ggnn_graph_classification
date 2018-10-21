package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String name = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int k = 0;
		int j = 0;
		int n;
		int i;
		int p;
		char[][] word = new char[100][100];
		name = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = name.length();
		for (i = 0;i < n;i++)
		{
			if (name.charAt(i) != ' ')
			{
				 word[k][j] = name.charAt(i);
				 j++;
			}
			else
			{
				  word[k][j] = '\0';
				  k++;
				  j = 0;
			}
		}
		word[k][j] = '\0';
		k++;

		for (p = 0;p < k;p++)
		{
			 if (strcmp(word[p],a) == 0)
			 {
				  word[p] = b;
			 }
		}
		for (p = 0;p < k - 1;p++)
		{
			  System.out.printf("%s ",word[p]);
		}
		System.out.printf("%s",word[k - 1]);
		return 0;
	}
}
