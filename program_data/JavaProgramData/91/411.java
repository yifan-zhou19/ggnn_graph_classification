package <missing>;

public class GlobalMembers
{
	public static int relative(tangible.RefObject<Integer> a, int len, int i)
	{
		int result;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		if (i < len - 1)
		{
			p = a.argValue + i;
			result = p + *(p + 1);
			return result;
		}
		else
		{
			p = a.argValue + i;
			result = p + a.argValue;
			return result;
		}
	}

	public static void Main()
	{
		String s = new String(new char[MAX]);
		int[] a = new int[MAX];
		int len;
		int i;

		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			a[i] = (s.Substring(i));
		}
		for (i = 0;i < len;i++)
		{
		tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
			System.out.printf("%c",relative(tempRef_a, len, i));
			a = tempRef_a.argValue;
		}
		System.out.print('\n');
	}
}

