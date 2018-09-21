package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] word = new char[200][20];
	String sen = new String(new char[1000]);
	int n;
	int i;
	int j;
	int[] len = new int[200];
	int t;
	int max;
	int min;
	int p1;
	int p2;
	i = 1;
	sen = new Scanner(System.in).nextLine();
	t = sen.length();
	n = 1;

	j = 1;
	for (i = 0;i <= t - 1;i++)
	{
	if (sen.charAt(i) != ' ' && sen.charAt(i) != ',')
	{
		word[n][j] = sen.charAt(i);
		j++;
	}
	if (sen.charAt(i) == ' ' || sen.charAt(i) == ',')
	{
		len[n] = j - 1;
		n++;
		j = 1;
	}
	if (sen.charAt(i) == ',')
	{
		i++;
	}
	if (i == t - 1)
	{
		len[n] = j - 1;
	}
	}
	max = 0;
	min = 50000;


	for (i = 1;i <= n;i++)
	{
		  if (len[i] > max)
		  {
			  max = len[i];
			  p1 = i;
		  }
	  if (len[i] < min)
	  {
		  min = len[i];
		  p2 = i;
	  }
	}
	if (max == min)
	{
		for (i = 1;i <= len[1];i++)
		{
			System.out.printf("%c",word[1][i]);
		}
		System.out.print("\n");
		for (i = 1;i <= len[1];i++)
		{
			System.out.printf("%c",word[1][i]);
		}
	}
	 else
	 {
		 for (i = 1;i <= len[p1];i++)
		 {
			 System.out.printf("%c",word[p1][i]);
		 }
			  System.out.print("\n");
			 for (i = 1;i <= len[p2];i++)
			 {
				 System.out.printf("%c",word[p2][i]);
			 }
	 }
	}

}
