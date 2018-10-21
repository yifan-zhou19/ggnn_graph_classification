package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	int i = 0;

	str = new Scanner(System.in).nextLine();

	while (str[i] != null)
	{
	if ('0' <= str[i] && str[i] <= '9')
	{
	System.out.printf("%c",str[i]);
	}
	if (i >= 1 && ('0' <= str[i - 1] && str[i - 1] <= '9') && !('0' <= str[i] && str[i] <= '9'))
	{
	System.out.print("\n");
	}
	i++;
	}



	}
}
