package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String p1;
		int i;
		int j;
		int k;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(200);
		p = new Scanner(System.in).nextLine();
		n = p.length();
		//printf("%d\n",n);
		for (i = n - 1,j = 0;i >= 0;i--)
		{
			if ((*(p.Substring(i)) == ' ') || (i == 0))
			{
				if (i != 0)
				{
					k = i + 1;
				}
				else
				{
					k = i;
				}
				for (;(*(p.Substring(k)) != ' ') && (*(p.Substring(k)) != '\0');k++, j++)
				{
					*(p1.Substring(j)) = *(p.Substring(k));
				}
				if (i != 0)
				{
					*(p1.Substring(j)) = ' ';
				}
				j = j + 1;
			}
		}
		*(p1.Substring(j)) = '\0';

		System.out.println(p1);
	}

}
