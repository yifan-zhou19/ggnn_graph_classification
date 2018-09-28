package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[1000]);
		char[][] s = new char[300][50];
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[100];
		w = new Scanner(System.in).nextLine();
		while (w.charAt(i) != '\0')
		{
		   while (w.charAt(i) != ' ' && w.charAt(i) != '\0')
		   {
			  s[j][k] = w.charAt(i);
			  i++;
			  k++;
		   }
		   s[j][k] = '\0';
		   j++;

		   k = 0;
		   while (w.charAt(i) == ' ')
		   {
			  i++;
		   }
		}
	for (i = 0;i < j;i++)
	{
		a[i] = String.valueOf(s[i]).length();
	}
	System.out.printf("%d",a[0]);
	for (i = 1;i < j;i++)
	{
		System.out.printf(",%d",a[i]);
	}
	return 0;
	}
}
