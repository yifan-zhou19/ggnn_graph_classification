package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		int n = 0;
		int m = -2;
		int s;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (String)calloc(1000,(Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		for (b = a; * b != 0;b++)
		{
		n++;
		}
		b = a;
		for (i = 0;i < n;i++)
		{
			if (*(b + i) == 32)
			{
				s = i - m;
				m = i;
				if (s == 1)
				{
					for (j = i;j < n - 1;j++)
					{
					*(b + j) = *(b + j + 1);
					}
					n = n - 1;
					i = i - 2;
				}
			}
		}
		for (b = a;b < a.Substring(n);b++)
		{
		System.out.printf("%c",*b);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
	}
}
