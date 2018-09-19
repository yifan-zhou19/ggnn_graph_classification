package <missing>;

public class GlobalMembers
{
	public static int ascmax(String str)
	{
		int sit = 0;
		int i;
		char max;
		max = str[0];
		for (i = 0; !str[i].equals('\0');i++)
		{
			if (str[i].compareTo(max) > 0)
			{
				max = str[i];
				sit = i + 1;
			}
		}
		return (sit);
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pa', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pb', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pc', so pointers on this parameter are left unchanged:
	public static void insert(int sit, char * pa, char * pb, char * pc)
	{
		int i = 0;
		while (i < sit)
		{
			*pc = pa;
			pc = pc.Substring(1);
			pa = pa.Substring(1);
			i++;
		}
		while (i >= sit != 0 && (i < sit + 3))
		{
			*pc = pb;
			pc = pc.Substring(1);
			pb = pb.Substring(1);
			i++;
		}
		while ((i >= sit + 3) && (*pa != '\0'))
		{
			*pc = pa;
			pc = pc.Substring(1);
			pa = pa.Substring(1);
			i++;
		}
		*pc = '\0';

	}
	public static void Main()
	{
		int sit;
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		String c = new String(new char[15]);
		while (scanf("%s",a) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = tempVar.charAt(0);
			}

			sit = ascmax(a);
			insert(sit, a, b, c);
			System.out.println(c);

		}


	}
}

