package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int flag = 0;
		String buffer = new String(new char[10000]);
		buffer = new Scanner(System.in).nextLine(); //however gets is dangerous

	while (buffer.charAt(i) != null)
	{
			if (flag != 0) // spaced
			{
				if (buffer.charAt(i) != ' ')
				{
					System.out.printf("%c",buffer.charAt(i));
					flag = 0; //reset flag
				}
			}
			else if (flag == 0) //not spaced
			{

			   System.out.printf("%c",buffer.charAt(i));
				if (buffer.charAt(i) == ' ')
				{
					flag = 1; //set flag
				}
			}
			i++;
	}
		return 0;
	}

}
