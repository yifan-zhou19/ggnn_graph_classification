package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String string = new String(new char[30000]);
	char c;
	int[] num = new int[300];
	int i;
	int n;
	int k = 0;
	int j = 0;
	int l;
	int word = 0;
	String = new Scanner(System.in).nextLine();

	for (i = 0;(c = string.charAt(i)) != '\0';i++)
	{
	if (c == ' ')
	{
		word = 0;
	}
	else
	{
	 if (word == 0)
	 {
		j++;
		word = 1;
	 }
	num[j]++;
	}
	}
	for (l = 1;l < j;l++)
	{
	System.out.printf("%d,",num[l]);
	}
	System.out.printf("%d",num[j]);

	}

}
