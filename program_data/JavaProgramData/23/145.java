package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * c = s;
		String[] k = new String[50];
		int kc = 0;
		int i = 0;
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		k[0] = (String) malloc((Character.SIZE / Byte.SIZE) * 100);
		for (; * c != 0; c++)
		{
			if (*c != ' ')
			{
				k[kc][i] = *c;
				i++;
			}
			else
			{
				k[kc][i] = 0;
				kc++;
				i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				k[kc] = (String) malloc((Character.SIZE / Byte.SIZE) * 100);
			}
		}
		k[kc][i] = 0;
		for (i = kc; i >= 0; i--)
		{
			System.out.printf("%s", k[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}
