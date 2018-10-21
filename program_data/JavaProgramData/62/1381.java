package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String q;
	 int a;
	 int i;
	 int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	q = p = malloc(100);
	q = new Scanner(System.in).nextLine();
	a = i = 0;
	while (*(p.Substring(i)) != '\0')
	{
		while ((*(p.Substring(i)) == ' ') && (*(p.Substring(i) + 1) == ' '))
		{
		j = i + 1;
	while (*(p.Substring(j)) != '\0')
	{
		*(p.Substring(j)) = *(p.Substring(j) + 1);
		j++;
	}
		}
	i++;
	}
	System.out.println(p);
	return 0;
	}
}
