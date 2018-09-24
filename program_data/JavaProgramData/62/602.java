package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
		int i;
		int t = 0;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 1;i < n;i++)
		{
			if (*(str.Substring(i)) == ' ' && *(str.Substring(i) - 1) == ' ')
			{
				t = t + 1;
			}
			else
			{
				*(str.Substring(i) - t) = *(str.Substring(i));
			}
		}
		for (i = 0;i < n - t;i++)
		{
			System.out.printf("%c",*(str.Substring(i)));
		}
	}
}
