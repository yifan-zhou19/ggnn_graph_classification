package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i = 0;
		int j;
		int t;
		str = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		do
		{
			j = 0;
			t = i;
			while (str.charAt(i) == a.charAt(j) && j < a.length())
			{
				i++;
				j++;
			}
			if (j == a.length())
			{
				printf(str.charAt(i) == '\0'?"%s":"%s ",b);
				i++;
			}
			else
			{
				do
				{
					System.out.printf("%c",str.charAt(t));
					t++;
				} while (str.charAt(t) != ' ' && str.charAt(t) != '\0');
				if (str.charAt(t) == ' ')
				{
					System.out.print(" ");
				}
				i = t + 1;
			}
		} while (str.charAt(i - 1) != '\0');
		System.out.print("\n");
		return 0;
	}
}

