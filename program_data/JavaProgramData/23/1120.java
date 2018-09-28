package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		int len;
		int i;
		int length = 0;
		int j;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = len - 1;i >= 0;i--)
		{
			if (str.charAt(i) != ' ')
			{
			length = length + 1;
			}
			else if (str[i] = ' ' && str.charAt(i + 1) != ' ')
			{
				j = i;
				for (j = i + 1;j <= i + length;j++)
				{
			System.out.printf("%c",str.charAt(j));
				}
			System.out.print(" ");
			length = 0;
			}
		}
		if (i == -1 && str.charAt(0) != ' ') //??????str[0]???????
		{
					  for (i = 0;i < length;i++)
					  {
				  System.out.printf("%c",str.charAt(i));
					  }
		}
	}

}
