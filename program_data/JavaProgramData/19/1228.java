package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] p = new String[200];
		String p1;
		String p2;
		int i = 0;
		int n;
		int j;
		for (i = 0;i < 200;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		}
		i = 0;
		for (j = 0;(*(p[i] + j) = System.in.read()) != '\n';j++)
		{
			if (*(p[i] + j) == ' ')
			{
				*(p[i] + j) = '\0';
				i++;
				j = -1;
			}
		}
		*(p[i] + j) = '\0';
		n = i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			p2 = tempVar2.charAt(0);
		}
		for (i = 0;i <= n;i++)
		{
			if (strcmp(p[i],p1) == 0)
			{
			p[i] = p2;
			}
		}
		System.out.printf("%s",p[0]);
		for (i = 1;i <= n;i++)
		{
			System.out.printf(" %s",p[i]);
		}
		return 0;
	}
}

