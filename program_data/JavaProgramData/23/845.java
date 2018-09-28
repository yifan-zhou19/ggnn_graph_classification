package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n;
		String[] p = new String[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[0] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s",p[i]) != EOF)
		{
			i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		}
		n = i;
		for (i = n - 1;i >= 0;i--)
		{
			if (i != n - 1)
			{
				System.out.print(" ");
			}
			System.out.printf("%s",p[i]);
		}
	}

}
