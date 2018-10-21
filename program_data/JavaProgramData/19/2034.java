package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[200]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] word = new char[100][100];
		int n;
		int k;
		int j = 0;
		int i;
		words = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = words.length();
		for (i = 0,k = 0;i < n + 1;i++)
		{
			if (words.charAt(i) == ' ' || words.charAt(i) == '\0')
			{
			   word[k][j] = '\0';
			   k++;
			   j = 0;
			}
			else
			{
			   word[k][j] = words.charAt(i);
			   j++;
			}
		}

		for (i = 0;i < k - 1;i++)
		{
			if (strcmp(word[i],a) == 0)
			{
				System.out.printf("%s ",b);
			}
			 else
			 {
				 System.out.printf("%s ",word[i]);
			 }
		}

		   if (strcmp(word[i],a) == 0)
		   {
			System.out.printf("%s",b);
		   }
		else
		{
			System.out.printf("%s",word[i]);
		}
		return 0;
	}
}
