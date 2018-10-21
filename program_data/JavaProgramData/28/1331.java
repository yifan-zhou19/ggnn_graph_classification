package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[10000]);
	int n;
	int i;
	int sum;
	int j;
	s = new Scanner(System.in).nextLine();
	n = s.length();
	j = 1;
	for (i = 0;i < n;i++)
	{
		if (s.charAt(i) == ' ')
		{
			j = 0;
		}
	}
	if (j != 0)
	{
		System.out.printf("%d",n);
	}
	else
	{
	for (sum = 0,i = 0;s.charAt(i) != '\0';i++)
	{
		 if (s.charAt(i) != ' ')
		 {
		sum++;
		 }
	else if (s.charAt(i) == ' ' && sum != 0)
	{
		System.out.printf("%d,",sum);
	sum = 0;
	}
	}
	for (sum = 0,i = n - 1;;i--)
	{
	if (s.charAt(i) == ' ')
	{
		break;
	}
	else
	{
	sum++;
	}
	}
	System.out.printf("%d",sum);
	}
	}
}
