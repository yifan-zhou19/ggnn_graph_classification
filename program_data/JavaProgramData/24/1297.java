package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		String p;
		String max;
		String min;
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
		int ma = 0;
		int mi = 10000;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		max = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		min = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		n = a.length();
		p = a;
		for (;;a++)
		{
			if (*a == ' ' || *a == '\0')
			{

				m = a - p;
				if (m > ma)
				{
					ma = m;
					max = p;
				}
				if (m < mi)
				{
					mi = m;
					min = p;
				}
				if (*a == '\0')
				{
					break;
				}
				p = a + 1;
			}
		}
		for (i = 0; * (max.Substring(i)) != ' ' && *(max.Substring(i));i++)
		{
			System.out.printf("%c",*(max.Substring(i)));
		}
		System.out.print("\n");
		for (i = 0; * (min.Substring(i)) != ' ' && *(min.Substring(i));i++)
		{
			System.out.printf("%c",*(min.Substring(i)));
		}
		System.out.print("\n");




	}
}
