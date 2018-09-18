package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p = 0;
		int k;
		String s;
		String ch;
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		ch = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < 100;i++)
		{
			*(s.Substring(i)) = '\0';
		}
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0; * (s.Substring(i)) != '\0';i++)
		{
		for (j = 0;(*(s.Substring(i)) != ' ' && *(s.Substring(i)) != '\0');i++, j++)
		{
				*(ch.Substring(j)) = *(s.Substring(i));
		}
		*(ch.Substring(j)) = '\0';
		if (strcmp(ch,a) == 0)
		{
			ch = b;
		}
		if (p > 0)
		{
			System.out.print(" ");
		}
		System.out.printf("%s",ch);
		for (k = 0;k <= j;k++)
		{
			*(ch.Substring(k)) = '\0';
		}
		p++;
		}
	}
}
