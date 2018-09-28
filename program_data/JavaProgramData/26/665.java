package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		/*char str[101];
		gets(str);
		int i, isfirst;
		for(i=0; str[i]!=NULL; i++)
		{
			if(str[i] != ' ')
			{
				printf("%c", str[i]);
				isfirst = 1;
			}
			else
			{
				if(isfirst)
				{
					printf(" ");
					isfirst = 0;
				}
			}
		}*/
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		System.out.print(str.charAt(0));
		int i;
		for (i = 1; str.charAt(i) != null; i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i) != str.charAt(i - 1))
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}
