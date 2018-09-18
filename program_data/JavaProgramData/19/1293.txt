package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		String p = new String(new char[100]);
		char[][] a = new char[100][100];
		String daitihuan;
		String tihuanwei;
		p = a;
		while (scanf("%s",p.Substring(i)) != EOF)
		{
			i++;
		}
		i--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		daitihuan = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		tihuanwei = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
		tihuanwei = p.Substring(i);
		daitihuan = p.Substring(i) - 1;
		for (j = 0;j < i - 1;j++)
		{
			if (strcmp(p.Substring(j),daitihuan) == 0)
			{
				p.Substring(j) = tihuanwei;
			}
		}
			for (j = 0;j < i - 1;j++)
			{
				System.out.printf("%s%s",p.Substring(j),j == i - 2?"":" ");
			}
	}
}
