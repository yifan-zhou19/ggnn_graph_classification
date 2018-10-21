package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String head;
		String q;
		int i;
		int j;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
	//	printf("%d",n);
		for (i = n - 1;i >= 0;i--)
		{
			if (*(p.Substring(i)) != ' ')
			{
				continue;
			}
			if (*(p.Substring(i)) == ' ')
			{
				for (j = i + 1; * (p.Substring(j)) != ' ' && *(p.Substring(j)) != '\0';j++)
				{
					System.out.printf("%c",*(p.Substring(j)));
				}
			}
			System.out.print(" ");
		}
		for (i = 0; * (p.Substring(i)) != ' ' && *(p.Substring(i)) != '\0';i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
	}
}
