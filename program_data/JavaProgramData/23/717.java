package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a;
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = n - 1;i > -1;i--)
		{
			*(a.Substring(i) + 1) = *(a.Substring(i));
		}
		*(a.Substring(n) + 1) = ' ';
		*(a.Substring(n) + 2) = '\0';
		a = ' ';
		for (i = n;i >= 0;i--)
		{
			if (*(a.Substring(i)) == ' ')
			{
				for (j = i + 1; * (a.Substring(j)) != ' ';j++)
				{
					System.out.printf("%c",*(a.Substring(j)));
				}
				if (i != 0)
				{
					System.out.print(" ");
				}
			}
		}
	}
}
