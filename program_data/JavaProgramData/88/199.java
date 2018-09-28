package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[40]);
	 int i = 0;
	 a = new Scanner(System.in).nextLine();
	 System.out.print("\n");
	 while (*(a.Substring(i)) != '\0')
	 {
		if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
		{
			System.out.printf("%c",*(a.Substring(i)));
		}
		else if (*(a.Substring(i) + 1) >= '0' && *(a.Substring(i) + 1) <= '9')
		{
			System.out.print("\n");
		}
		i++;
	 }
	}
}
