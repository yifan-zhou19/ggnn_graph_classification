package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[100];
		int i;
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100);
		}
		i = 0;
		while (scanf("%s",p[i]) != EOF)
		{
			i++;
		}
		int j = 0;
		System.out.printf("%s",p[i - 1]);
		for (j = i - 2;j >= 0;j--)
		{
			System.out.printf(" %s",p[j]);
		}
	}

}
