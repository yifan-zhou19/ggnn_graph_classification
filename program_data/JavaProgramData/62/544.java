package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		int i;
		int j;
		int k;
		int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (i = 0;i < p.length() - num;i++)
		{
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) == ' ')
			{
				k = i;
				for (j = i + 1;j < p.length() - num;j++,i++)
				{
					*(p.Substring(i)) = *(p.Substring(j));
				}
				num++;
				i = k - 1;
			}
		}
		for (i = 0;i < p.length() - num;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		return 0;
	}
}
