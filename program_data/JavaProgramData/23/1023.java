package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[300];
		int i = 0;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s",p[i]) != EOF)
		{
			i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		}
		k = i - 1;
		for (i = k;i >= 0;i--)
		{
			if (i == k)
			{
				System.out.printf("%s",p[i]);
			}
			else
			{
				System.out.printf(" %s",p[i]);
			}
		}
	}
}
