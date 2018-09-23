package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static String findmax(char * p)
	{
		String max;
		for (max = p; * p != '\0';p++)
		{
			if (*p > max)
			{
				max = p;
			}
		}
		return max;
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'op', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'sp', so pointers on this parameter are left unchanged:
	public static void insert(char * op, char * sp)
	{
		  for (; * op != findmax(op);op++)
		  {
			System.out.printf("%c", *op);
		  }
		System.out.printf("%c", *op);

		for (; * sp != '\0';sp++)
		{
			System.out.printf("%c", *sp);
		}

		for (op++; * op != '\0';op++)
		{
			System.out.printf("%c", *op);
		}

		System.out.print("\n");
	}

	public static void Main()
	{
		String ori = new String(new char[10]);
		String sub = new String(new char[3]);
		String newstr = new String(new char[13]);
		String orip = ori;
		String subp = sub;
		String newstrp = newstr;

		while (scanf("%s %s", ori, sub) != EOF)
		{
			insert(orip, subp);
		}
	}


}
