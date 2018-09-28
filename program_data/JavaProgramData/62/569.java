package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		int i;
		int j;
		int k;
		int a;
		int b;
		b = 0;
		for (i = 0;i < 1000;i++)
		{
			*(p.Substring(i)) = System.in.read();
			if (*(p.Substring(i)) == '\n')
			{
				a = i;
				break;
			}
		}
		for (i = 0;i < a;i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				while (*(p.Substring(i) + 1) == ' ')
				{
					b++;
					for (j = i + 1;j < a;j++)
					{
					*(p.Substring(j)) = *(p.Substring(j) + 1);
					}
				}
			}
		}
		for (i = 0;i < a - b;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
	}

}
