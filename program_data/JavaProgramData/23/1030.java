package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[100];
		char end = '\n';
		int i;
		int count;
		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(20 * (Character.SIZE / Byte.SIZE));
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p + i = tempVar;
			}
			if (end == System.in.read())
			{
				count = i;
				break;
			}
		}
		for (i = count;i > 0;i--)
		{
			System.out.printf("%s ",p + i);
		}
		System.out.printf("%s",p + i);
	}
}

