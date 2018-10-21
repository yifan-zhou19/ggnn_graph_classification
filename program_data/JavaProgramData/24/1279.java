package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int max;
		int min;
		int i1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
		j = 0;
		k = 0;
		t = 0;
		for (i = 0;i < n;i++)
		{

			if (*(p.Substring(i)) != ' ')
			{
				k++;
			}
			else
			{
				*(a + j) = k;
				*(b + j) = i + 1;
				k = 0;
				j++;
			}
		}
			k = 0;
			for (i1 = n - 1;i1 >= 0;i1--)
			{
				if (*(p.Substring(i1)) != ' ')
				{
					k++;
				}
				else
				{
					break;
				}
			}
			if (i1 < 0)
			{
				*(a + j) = n;
			}
			else
			{
				*(a + j) = k;
			}
			*(b + j) = n + 1;
			max = a;
			for (i1 = 0;i1 <= j;i1++)
			{
				if (*(a + i1) > max)
				{
					max = (a + i1);
					t = i1;
				}
			}
				if (t != 0)
				{
				for (i1 = (b + t - 1);i1 < (*(b + t) - 1);i1++)
				{
					System.out.printf("%c",*(p.Substring(i1)));
				}
				}
				else
				{
					for (i1 = 0;i1 < *(b + t) - 1;i1++)
					{
						System.out.printf("%c",*(p.Substring(i1)));
					}
				}
				System.out.print("\n");

			   t = 0;
				min = a;
			for (i1 = 0;i1 <= j;i1++)
			{
				if (*(a + i1) < min)
				{
					min = (a + i1);
					t = i1;
				}
			}
				if (t != 0)
				{
				for (i1 = (b + t - 1);i1 < (*(b + t) - 1);i1++)
				{
					System.out.printf("%c",*(p.Substring(i1)));
				}
				}
				else
				{
					for (i1 = 0;i1 < *(b + t) - 1;i1++)
					{
						System.out.printf("%c",*(p.Substring(i1)));
					}
				}
				System.out.print("\n");




	}
}
