package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(30);
		a = new Scanner(System.in).nextLine();
		if (a >= '0' && a <= '9')
		{
			System.out.printf("%c", a);
		}
		for (i = 1; * (a.Substring(i)) != '\0';i++)
		{
			if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
			{
				System.out.printf("%c",*(a.Substring(i)));
			}
			else if ((*(a.Substring(i)) < '0' || *(a.Substring(i))>'9') && *(a.Substring(i) - 1) >= '0' && *(a.Substring(i) - 1) <= '9')
			{
				System.out.print("\n");
			}
		}
	}
}
