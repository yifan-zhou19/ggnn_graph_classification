package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (String)calloc(10000,(Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		for (i = 0; * (a.Substring(i)) != '\0';i++)
		{
			if (*(a.Substring(i) + 1) == '\0')
			{
				System.out.printf("%c",*(a.Substring(i)) + *(a.Substring(0)));
			}
			else
			{
				System.out.printf("%c",*(a.Substring(i)) + *(a.Substring(i) + 1));
			}
		}
	}

}
