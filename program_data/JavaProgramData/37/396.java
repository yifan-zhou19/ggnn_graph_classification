package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		char[][] str = new char[10][100000];
		String p = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * c;
		String a = new String(new char[1]);
		a = new Scanner(System.in).nextLine();

		int[] letter = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * count;

		for (p = str;p < str + t;p++)
		{
			*p = new Scanner(System.in).nextLine();
		}

		for (p = str;p < str + t;p++)
		{
			for (c = p; * c != 0;c++)
			{
				count = letter + *c - 'a';
				(*count)++;
			}
			for (c = p; * c != 0;c++)
			{
				count = letter + *c - 'a';
				/*printf("%c %d\n",*c,*count);//for test*/
				if (*count == 1)
				{
					System.out.printf("%c\n",count - letter + 'a');
					break;
				}
			}
			if (*c == 0)
			{
				System.out.print("no\n");
			}
			for (count = letter;count < letter + 26;count++)
			{
				*count = 0;
			}
		}
		return 0;
	}




}

