package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		char s;
		int n;
		int i;
		int j = 0;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(40 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(40 * (Integer.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) > 47 && *(p.Substring(i)) < 58)
			{
				*(q + j) = *(p.Substring(i)) - 48;
			//	printf("%d\n",*(q+j));

				j++;
			}
			else
			{
				*(q + j) = -1;
			j++;
			}

		}
		for (i = 0;i < j;i++)
		{
			m = m + *(q + i);
			if (*(q + i) != -1)
			{

				System.out.printf("%d",*(q + i));
			}
			else
			{
				if (*(q + i + 1) != -1 && (m + i + 1 != 0))
				{
					System.out.print("\n");
				}
			}



		}

	}
}
