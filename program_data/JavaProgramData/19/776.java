package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[123]);
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		char[][] danci = new char[50][20];
		String ss = s;
		String aa = a;
		String bb = b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String[] word = new String[50];
		int i;
		int j = 0;
		int num;
		for (i = 0;i < 50;i++)
		{
			word[i] = danci[i];
		}
		ss = new Scanner(System.in).nextLine();
		aa = new Scanner(System.in).nextLine();
		bb = new Scanner(System.in).nextLine();
		for (p1 = p2 = s;;p1++)
		{
			if (*p1 == ' ' || *p1 == '\0')
			{
				word[j] = p2.substring(0, p1 - p2);
				*(word[j] + (p1 - p2)) = '\0';
				p2 = p1 + 1;
				j++;
				if (*p1 == '\0')
				{
					break;
				}
			}
		}
		num = j;
		for (j = 0;j < num;j++)
		{
			if (!strcmp(word[j],aa))
			{
				word[j] = bb;
			}
		}
		for (j = 0;j < num - 1;j++)
		{
			System.out.printf("%s ",word[j]);
		}
		System.out.printf("%s",word[j]);
	}



}
