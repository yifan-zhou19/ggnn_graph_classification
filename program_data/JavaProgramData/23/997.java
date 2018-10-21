package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		final String b = "";
		(char)(*q)[100];
		int i = 0;
		int j = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		q = b;
		for (p = a; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				*(*(q + i) + j) = *p;
				j++;
			}
			else
			{
				i++;
				j = 0;
			}
		}
		n = i;
		for (i = n;i > 0;i--)
		{
			for (j = 0; * (*(q + i) + j) != '\0';j++)
			{
				System.out.printf("%c",*(*(q + i) + j));
			}
			System.out.print(" ");
		}
		for (j = 0; * (*q + j) != '\0';j++)
		{
			System.out.printf("%c",*(*q + j));
		}
		System.out.print("\n");
	}
}
