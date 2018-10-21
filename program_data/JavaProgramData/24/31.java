package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[2000]);
		c = new Scanner(System.in).nextLine();
		int i;
		int l;
		int n = 2;
		l = c.length();
		for (i = 0;i <= l - 1;i++)
		{
			if (c.charAt(i) == ' ')
			{
				n++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)calloc(n,sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		int p = (int)calloc(n,(Integer.SIZE / Byte.SIZE));
		p = -1;
		int j;
		j = 1;
		for (i = 0;i <= l - 1;i++)
		{
			if (c.charAt(i) == ' ')
			{
				*(p + j) = i;
				j++;
			}
		}
		*(p + j) = l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=(int*)calloc(n-1,sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		int p1 = (int)calloc(n - 1,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i <= n - 2;i++)
		{
			*(p1 + i) = *(p + i + 1) - *(p + i) - 1;
		}
		int max;
		int min;
		int smax;
		int smin;
		max = 0;
		min = 2000;
		for (i = 0;i <= n - 2;i++)
		{
			if (*(p1 + i) > max)
			{
				max = (p1 + i);
				smax = (p + i) + 1;
			}
			if (*(p1 + i) < min)
			{
				min = (p1 + i);
				smin = (p + i) + 1;
			}
		}
		for (i = 0;i <= max - 1;i++)
		{
			System.out.printf("%c",c.charAt(smax + i));
		}
		System.out.print("\n");
		for (i = 0;i <= min - 1;i++)
		{
			System.out.printf("%c",c.charAt(smin + i));
		}
		System.out.print("\n");
	}
}
