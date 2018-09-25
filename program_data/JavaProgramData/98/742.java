package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String word = new String(new char[40]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		q = word;
		while (*q != '\0')
		{
			q++;
		}
		a[1] = q - word;
		s = s + a[1] + 1;
		System.out.print(word);
		for (int i = 2;i <= n;i++)
		{
			String words = new String(new char[40]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			words = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p = words;
			while (*p != '\0')
			{
				p++;
			}
			a[i] = p - words;
			s = s + a[i] + 1;
			if (s <= 80)
			{
			System.out.print(" ");
			System.out.print(words);
			}
			else
			{
					if (s == 81)
					{
						System.out.print(" ");
						System.out.print(words);
					}
				else
				{
				System.out.print("\n");
			System.out.print(words);
			s = a[i] + 1;
				}
			}

		}
		return 0;
	}

}

