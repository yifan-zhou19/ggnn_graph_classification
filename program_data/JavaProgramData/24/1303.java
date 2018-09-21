package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String tmax;
		String tmin;
		int n;
		int max = 0;
		int min = 1000;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		p = q = str;
		while (true)
		{
			if (*p != ' ' && *p != '\0')
			{
				p++;
				continue;
			}
			if (*p == ' ' || *p == '\0')
			{
				n = p - q;
				if (n > max)
				{
					max = n;
					tmax = q;
				}
				if (n < min)
				{
					min = n;
					tmin = q;
				}
				if (*p == '\0')
				{
					break;
				}
				p++;
				q = p;
				continue;
			}
		}
		for (;(tmax) != ' ' && (tmax) != '\0';tmax++)
		{
			System.out.printf("%c", tmax);
		}
		System.out.print("\n");
		for (;(tmin) != ' ' && (tmin) != '\0';tmin++)
		{
			System.out.printf("%c", tmin);
		}
	}
}
