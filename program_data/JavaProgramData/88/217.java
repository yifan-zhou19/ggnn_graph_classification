package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		int i;
		int sum = 0;
		a = new Scanner(System.in).nextLine();
		if (*(a.Substring(0)) >= '0' && *(a.Substring(0)) <= '9')
		{
			System.out.printf("%c",*(a.Substring(0)));
		}
		for (i = 1; * (a.Substring(i)) != '\0';i++)
		{
			if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
			{
				System.out.printf("%c",*(a.Substring(i)));
			}
			else if (*(a.Substring(i) + 1) >= '0' && *(a.Substring(i) + 1) <= '9')
			{
				System.out.print("\n");
			}
		}


	}
}
