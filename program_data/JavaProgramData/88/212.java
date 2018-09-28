package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String org;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		org = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		org = new Scanner(System.in).nextLine();
		for (p = org; * p != '\0';p++)
		{
			if (Character.isDigit(*p) == 0)
			{
				if (num == 0)
				{
					System.out.print("\n");
				}
				num++;
			}
			else
			{
				num = 0;
				System.out.printf("%c",*p);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(org);
	}


}
