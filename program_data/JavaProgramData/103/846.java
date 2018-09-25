public class stu
{
	public char letter;
	public int count;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] b = tangible.Arrays.initializeWithDefaultstuInstances(1001);
		String c = new String(new char[1000]);
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		str = p = c;
		c = new Scanner(System.in).nextLine();
		while (*p != null)
		{
			if (*p >= 'a' && *p <= 'z')
			{
				*p = p + 'A'-'a';
			}
			p++;
		}
		b[0].letter = str;
		b[0].count = 1;
		str = str.Substring(1);
		j = 0;
		while (str != null)
		{
			if (str == *(str - 1))
			{
				b[j].count++;
			}
			else
			{
				j++;
				b[j].letter = str;
				b[j].count = 1;
			}
			str = str.Substring(1);
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("(%c,%d)",b[i].letter,b[i].count);
		}
		return 0;
	}
}

