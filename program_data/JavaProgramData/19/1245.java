package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n;
		String[] s = new String[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s[0] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s",s[i]) != EOF)
		{
			i++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			s[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		}
		n = i;
		for (i = 0;i < n - 2;i++)
		{
			if (strcmp(s[i],s[n - 2]) == 0)
			{
				s[i] = s[n - 1];
			}
			if (i != n - 3)
			{
				System.out.printf("%s ",s[i]);
			}
			else
			{
				System.out.printf("%s",s[i]);
			}
		}
	}
}
