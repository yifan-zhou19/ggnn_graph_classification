package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		String[] p = new String[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc(100);
		while (scanf("%s",p[i]) != EOF)
		{
			i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100);
		}
		for (i--;i > 0;i--)
		{
			System.out.printf("%s ",p[i]);
		}
		System.out.printf("%s",p[0]);
	}


}
