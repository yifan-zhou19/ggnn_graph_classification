package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		String s = new String(new char[100]);
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (char[100])malloc(100 * 100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s",*(s.Substring(i))) != EOF)
		{
			i++;
		}
		n = i;
		a = *(s.Substring(n) - 2);
		b = *(s.Substring(n) - 1);
		for (i = 0;i < n - 2;i++)
		{
			if (strcmp(a,*(s.Substring(i))) == 0)
			{
				*(s.Substring(i)) = b;
			}
		}
		for (i = 0;i < n - 3;i++)
		{
			System.out.printf("%s ",*(s.Substring(i)));
		}
		System.out.printf("%s",*(s.Substring(n) - 3));
	}
}
