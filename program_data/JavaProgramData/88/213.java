package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String org;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		org = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		org = new Scanner(System.in).nextLine();
		int i;
		int j;
		int count;
		for (i = 0; * (org.Substring(i)) != '\0';i++)
		{
			if (*(org.Substring(i)) >= '0' && *(org.Substring(i)) <= '9')
			{
				count = 0;
				System.out.printf("%c",*(org.Substring(i)));
			}
			else
			{
				if (i != 0 && count == 0)
				{
					System.out.print("\n");
				}
				count++;
			}
		}
	}


}
