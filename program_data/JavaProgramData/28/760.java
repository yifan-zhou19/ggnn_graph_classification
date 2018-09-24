package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		int i;
		int j;
		int k;
		int r;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(2000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();

		for (i = 0,j = 0; * (p.Substring(i)) != '\0';i++)
		{
			if ((i == 0) || (*(p.Substring(i) - 1) == ' ') && (*(p.Substring(i)) != ' '))
			{
				for (*(a + j) = 0;(*(p.Substring(i)) != ' ') && (*(p.Substring(i)) != '\0');i++)
				{
					*(a + j) = *(a + j) + 1;

				}
				j = j + 1;
				i = i - 1;
			}
			s = j;
		//	printf("%d ",*(a+j-1));

		}
		//printf("%d\n",s);
		for (k = 0;k < s - 1;k++)
		{
			System.out.printf("%d,",*(a + k));
		}
		System.out.printf("%d",*(a + s - 1));
	}



}
