package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[100];
		int i = 0;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc(100);
		while (scanf("%s",p[i]) != EOF)
		{
			i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100);
		}
		for (j = 0;j < i - 2;j++)
		{
			if (strcmp(p[j],p[i - 2]) == 0)
			{
				p[j] = p[i - 1];
			}
		}
		System.out.printf("%s",p[0]);
		for (j = 1;j < i - 2;j++)
		{
			System.out.printf(" %s",p[j]);
		}
	}

}
