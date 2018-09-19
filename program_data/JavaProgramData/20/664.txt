package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String str;
		String substr;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(20 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		substr = (String)malloc(20 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = str.length();
			max = 0;
			for (i = 0;i < n;i++)
			{
				if (*(str.Substring(i)) > max)
				{
					max = (str.Substring(i));
				}
			}
			for (i = 0;i < n;i++)
			{
				if (*(str.Substring(i)) == max)
				{
					for (j = 0;j <= i;j++)
					{
						System.out.printf("%c",*(str.Substring(j)));
					}
					System.out.printf("%s",substr);
					if (i == n - 1)
					{
						System.out.print("\n");
						break;
					}
					for (j = i + 1;j < n - 1;j++)
					{
						System.out.printf("%c",*(str.Substring(j)));
					}
					System.out.printf("%c\n",*(str.Substring(n) - 1));
					break;
				}
			}
		}
	}
}
