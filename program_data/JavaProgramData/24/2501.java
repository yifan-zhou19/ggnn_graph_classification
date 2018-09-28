package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sen = new String(new char[2000]);
	char[][] word = new char[300][20];
	int n;
	int j;
	int i;
	int t;
	int len;
	int max;
	int min;
	int p;
	int q;
	sen = new Scanner(System.in).nextLine();
	len = sen.length();
	n = 1;
	j = 0;
	for (i = 0;i <= len - 1;i++)
	{
		 if (sen.charAt(i) != ' ' && sen.charAt(i) != ',')
		 {
			 word[n][j] = sen.charAt(i);
									   j++;
		 }
	   if (sen.charAt(i) == ' ')
	   {
		   n++;
		   j = 0;
	   }
	   if (sen.charAt(i) == ',')
	   {
		   i++;
		   n++;
		   j = 0;
	   }
	}
	max = 0;
	min = 10000;
	for (i = 1;i <= n;i++)
	{
		 if (max < String.valueOf(word[i]).length())
		 {
			 max = String.valueOf(word[i]).length();
			 p = i;
		 }
		if (min > String.valueOf(word[i]).length())
		{
			min = String.valueOf(word[i]).length();
			q = i;
		}
	}
	System.out.printf("%s\n",word[p]);
	System.out.printf("%s",word[q]);
	}
}
