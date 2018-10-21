package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	int j = 0;
	int k = 0;
	int[] a = new int[101];
	int[] b = new int[101];
	int l;
	String s = new String(new char[101]);
	final String str = "";
	s = new Scanner(System.in).nextLine();
	l = s.length();
	while (i <= l)
	{
		if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
		{
	   str.charAt(k)[j] = s.charAt(i);
	   j++;
	   i++;
		}
	else
	{
	if (s.charAt(i) == ' ')
	{
		   str.charAt(k)[j] = '\0';
		   j = 0;
		   while (i < l && s.charAt(i) == ' ')
		   {
	b[k]++;
	i++;
		   }
			k++;
	}
	else
	{
	str.charAt(k)[j] = '\0';
	i++;
	k++;
	}
	}
	}
	for (i = k - 1;i >= 0;i--)
	{
	   for (j = 1;j <= b[i];j++)
	   {
	   System.out.print(" ");
	   }
	   System.out.printf("%s",str.charAt(i));
	}
	return 0;
	}

}
