package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		String[] p = new String[100];
		String daitihuan;
		String tihuanwei;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[0] = (String)malloc(30);
		while (scanf("%s",p[i]) != EOF)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i + 1] = (String)malloc(30);
			i++;
		}
		i--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		daitihuan = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		tihuanwei = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
		tihuanwei = p[i];
		daitihuan = p[i - 1];
		for (j = 0;j < i - 1;j++)
		{
			if (strcmp(p[j],daitihuan) == 0)
			{
				p[j] = tihuanwei;
			}
		}
			for (j = 0;j < i - 1;j++)
			{
				System.out.printf("%s%s",p[j],j == i - 2?"":" ");
			}
	}
}
